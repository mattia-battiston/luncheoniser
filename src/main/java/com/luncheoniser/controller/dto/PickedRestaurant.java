package com.luncheoniser.controller.dto;

public class PickedRestaurant {

    private String restaurantName;
    private String cuisineType;
    private String priceRange;
    private String avgRating;
    private String pictureLink;

    public PickedRestaurant(String restaurantName, String cuisineType, String priceRange, String avgRating, String pictureLink) {
        this.restaurantName = restaurantName;
        this.cuisineType = cuisineType;
        this.priceRange = priceRange;
        this.avgRating = avgRating;
        this.pictureLink = pictureLink;
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
}
