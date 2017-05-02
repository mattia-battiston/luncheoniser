package com.luncheoniser.usecase;

import com.luncheoniser.domain.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component
public class PickLuncheonUseCase {

    private final GetAllLocalRestaurants getAllLocalRestaurants;

    @Autowired
    public PickLuncheonUseCase(GetAllLocalRestaurants getAllLocalRestaurants) {
        this.getAllLocalRestaurants = getAllLocalRestaurants;
    }

    public Restaurant pickLuncheon() {
        List<Restaurant> allLocalRestaurants = getAllLocalRestaurants.getAllLocalRestaurants();

        return pickARandomRestaurant(allLocalRestaurants);
    }

    private Restaurant pickARandomRestaurant(List<Restaurant> allLocalRestaurants) {
        int restaurantIndex = new Random().nextInt(allLocalRestaurants.size());
        return allLocalRestaurants.get(restaurantIndex);
    }

}
