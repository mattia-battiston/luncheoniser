package com.luncheoniser.entrypoint;

import com.luncheoniser.domain.Restaurant;
import com.luncheoniser.entrypoint.dto.LocalRestaurant;
import com.luncheoniser.usecase.PickLuncheonUseCase;
import com.luncheoniser.usecase.RestaurantFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

import static java.util.Arrays.stream;
import static java.util.stream.Collectors.toList;
import static org.apache.commons.lang3.StringUtils.split;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
public class PickLuncheonController {

    private final PickLuncheonUseCase pickLuncheonUseCase;

    @Autowired
    public PickLuncheonController(PickLuncheonUseCase pickLuncheonUseCase) {
        this.pickLuncheonUseCase = pickLuncheonUseCase;
    }

    @RequestMapping(value = "/pickluncheon", method = GET)
    @ResponseBody
    public LocalRestaurant pickLuncheon(
            @RequestParam(value = "excludedRestaurantIds", required = false) String excludedRestaurantIds
        ) {
        RestaurantFilter restaurantFilter = new RestaurantFilter(parse(excludedRestaurantIds));

        Restaurant restaurant = pickLuncheonUseCase.pickLuncheon(restaurantFilter);

        return new LocalRestaurant(
                restaurant.getId(),
                restaurant.getName(),
                restaurant.getCuisineType().name(),
                restaurant.getPriceRange().toString(),
                String.valueOf(restaurant.getAverageRating()),
                restaurant.getPictureLink(),
                restaurant.isEatIn(),
                restaurant.isTakeAway()
        );
    }

    private List<Integer> parse(String excludedRestaurantIds) {
        return stream(split(excludedRestaurantIds, ",")).mapToInt(Integer::parseInt).boxed().collect(toList());
    }

}