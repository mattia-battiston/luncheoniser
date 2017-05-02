package com.luncheoniser.entrypoint;

import com.luncheoniser.domain.Restaurant;
import com.luncheoniser.entrypoint.dto.PickedRestaurant;
import com.luncheoniser.usecase.PickLuncheonUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PickLuncheonController {

    private final PickLuncheonUseCase pickLuncheonUseCase;

    @Autowired
    public PickLuncheonController(PickLuncheonUseCase pickLuncheonUseCase) {
        this.pickLuncheonUseCase = pickLuncheonUseCase;
    }

    @RequestMapping("/pickluncheon")
    @ResponseBody
    public PickedRestaurant home() {
        Restaurant restaurant = pickLuncheonUseCase.pickLuncheon();

        return new PickedRestaurant(
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