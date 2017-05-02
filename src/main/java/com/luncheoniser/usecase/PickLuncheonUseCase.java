package com.luncheoniser.usecase;

import com.luncheoniser.domain.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PickLuncheonUseCase {

    private final GetAllLocalRestaurants getAllLocalRestaurants;

    @Autowired
    public PickLuncheonUseCase(GetAllLocalRestaurants getAllLocalRestaurants) {
        this.getAllLocalRestaurants = getAllLocalRestaurants;
    }

    public Restaurant pickLuncheon() {
        return getAllLocalRestaurants.getAllLocalRestaurants().get(0);
    }

}
