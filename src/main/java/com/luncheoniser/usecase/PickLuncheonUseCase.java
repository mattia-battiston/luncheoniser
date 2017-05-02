package com.luncheoniser.usecase;

import com.luncheoniser.domain.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

import static java.util.stream.Collectors.toList;

@Component
public class PickLuncheonUseCase {

    private final GetAllLocalRestaurants getAllLocalRestaurants;

    @Autowired
    public PickLuncheonUseCase(GetAllLocalRestaurants getAllLocalRestaurants) {
        this.getAllLocalRestaurants = getAllLocalRestaurants;
    }

    public Restaurant pickLuncheon(RestaurantFilter restaurantFilter) {
        List<Restaurant> allLocalRestaurants = getAllLocalRestaurants.getAllLocalRestaurants();

        List<Restaurant> filteredRestaurants = allLocalRestaurants.stream()
                .filter(restaurant -> notAnExcludedId(restaurant, restaurantFilter))
                .filter(restaurant ->  eatInOrTakeaway(restaurant, restaurantFilter))
                .collect(toList());

        return pickARandomRestaurantFrom(filteredRestaurants);
    }

    private boolean eatInOrTakeaway(Restaurant restaurant, RestaurantFilter restaurantFilter) {
        if(restaurantFilter.isEatIn() && restaurantFilter.isTakeAway()) {
            return true;
        }

        if(restaurantFilter.isEatIn()) {
            return restaurant.isEatIn();
        }

        if(restaurantFilter.isTakeAway()) {
            return restaurant.isTakeAway();
        }

        return true;
    }


    private boolean notAnExcludedId(Restaurant restaurant, RestaurantFilter restaurantFilter) {
        return !restaurantFilter.getExcludedRestaurantIds().contains(restaurant.getId());
    }

    private Restaurant pickARandomRestaurantFrom(List<Restaurant> allLocalRestaurants) {
        int restaurantIndex = new Random().nextInt(allLocalRestaurants.size());
        return allLocalRestaurants.get(restaurantIndex);
    }

}
