package com.luncheoniser.entrypoint;

import com.luncheoniser.domain.Restaurant;
import com.luncheoniser.entrypoint.dto.LocalRestaurant;
import com.luncheoniser.usecase.GetAllLocalRestaurantsUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

import static java.util.stream.Collectors.toList;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
public class AllLocalRestaurantsController {

    private GetAllLocalRestaurantsUseCase getAllLocalRestaurantsUseCase;

    @Autowired
    public AllLocalRestaurantsController(GetAllLocalRestaurantsUseCase getAllLocalRestaurantsUseCase) {
        this.getAllLocalRestaurantsUseCase = getAllLocalRestaurantsUseCase;
    }

    @RequestMapping(value = "/localrestaurant", method = GET)
    @ResponseBody
    public List<LocalRestaurant> getAllLocalRestaurants() {
        return
                getAllLocalRestaurantsUseCase.getAllLocalRestaurants().stream()
                        .map(restaurant -> toDto(restaurant))
                        .collect(toList());
    }

    private LocalRestaurant toDto(Restaurant restaurant) {
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

}
