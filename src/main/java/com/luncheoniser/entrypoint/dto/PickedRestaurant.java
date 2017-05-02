package com.luncheoniser.entrypoint.dto;

import com.luncheoniser.domain.EatingLocation;

public class PickedRestaurant {

    private final String restaurantName;
    private final String cuisineType;
    private final String priceRange;
    private final String avgRating;
    private final String pictureLink;
    private final String eatingLocation;

    public PickedRestaurant(String restaurantName, String cuisineType, String priceRange, String avgRating, String pictureLink, String eatingLocation) {
        this.restaurantName = restaurantName;
        this.cuisineType = cuisineType;
        this.priceRange = priceRange;
        this.avgRating = avgRating;
        this.pictureLink = pictureLink;
        this.eatingLocation = eatingLocation;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public String getCuisineType() {
        return cuisineType;
    }

    public String getPriceRange() {
        return priceRange;
    }

    public String getAvgRating() {
        return avgRating;
    }

    public String getPictureLink() {
        return pictureLink;
    }

    public String getEatingLocation() {
        return eatingLocation;
    }
}
