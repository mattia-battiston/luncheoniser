package com.luncheoniser.usecase;

import java.util.List;

public class RestaurantFilter {

    private List<Integer> excludedRestaurantIds;
    private boolean eatIn;
    private boolean takeAway;

    public void setExcludedRestaurantIds(List<Integer> excludedRestaurantIds) {
        this.excludedRestaurantIds = excludedRestaurantIds;
    }

    public List<Integer> getExcludedRestaurantIds() {
        return excludedRestaurantIds;
    }

    public boolean isEatIn() {
        return eatIn;
    }

    public void setEatIn(boolean eatIn) {
        this.eatIn = eatIn;
    }

    public boolean isTakeAway() {
        return takeAway;
    }

    public void setTakeAway(boolean takeAway) {
        this.takeAway = takeAway;
    }
}
