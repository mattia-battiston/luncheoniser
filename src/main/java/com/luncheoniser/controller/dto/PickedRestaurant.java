package com.luncheoniser.controller.dto;

public class PickedRestaurant {

    private final String restaurantName;
    private final String cuisineType;
    private final String priceRange;
    private final String avgRating;
    private final String pictureLink;
    private final EatingLocation eatingLocation;

    public PickedRestaurant(String restaurantName, String cuisineType, String priceRange, String avgRating, String pictureLink, EatingLocation eatingLocation) {
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

    public EatingLocation getEatingLocation() {
        return eatingLocation;
    }
}
