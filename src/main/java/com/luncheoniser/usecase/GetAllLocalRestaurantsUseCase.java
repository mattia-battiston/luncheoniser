package com.luncheoniser.usecase;

import com.luncheoniser.domain.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GetAllLocalRestaurantsUseCase {

    private GetAllLocalRestaurants getAllLocalRestaurants;

    @Autowired
    public GetAllLocalRestaurantsUseCase(GetAllLocalRestaurants getAllLocalRestaurants) {
        this.getAllLocalRestaurants = getAllLocalRestaurants;
    }

    public List<Restaurant> getAllLocalRestaurants() {
        return getAllLocalRestaurants.getAllLocalRestaurants();
    }
}
