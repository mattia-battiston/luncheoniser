package com.luncheoniser.usecase;

import java.util.List;

public class RestaurantFilter {

    private final List<Integer> excludedRestaurantIds;

    public RestaurantFilter(List<Integer> excludedRestaurantIds) {
        this.excludedRestaurantIds = excludedRestaurantIds;
    }

    public List<Integer> getExcludedRestaurantIds() {
        return excludedRestaurantIds;
    }
}
