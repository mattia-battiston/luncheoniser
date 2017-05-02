package com.luncheoniser.usecase;

import com.luncheoniser.domain.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;
import java.util.function.Predicate;

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
                .filter(notAnExcludedId(restaurantFilter))
                .collect(toList());

        return pickARandomRestaurantFrom(filteredRestaurants);
    }

    private Predicate<Restaurant> notAnExcludedId(RestaurantFilter restaurantFilter) {
        return restaurant -> !restaurantFilter.getExcludedRestaurantIds().contains(restaurant.getId());
    }

    private Restaurant pickARandomRestaurantFrom(List<Restaurant> allLocalRestaurants) {
        int restaurantIndex = new Random().nextInt(allLocalRestaurants.size());
        return allLocalRestaurants.get(restaurantIndex);
    }

}
