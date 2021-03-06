package com.luncheoniser.entrypoint.dto;

public class LocalRestaurant {

    private int id;
    private final String restaurantName;
    private final String cuisineType;
    private final String priceRange;
    private final String avgRating;
    private final String pictureLink;
    private final boolean eatIn;
    private final boolean takeAway;

    public LocalRestaurant(int id, String restaurantName, String cuisineType, String priceRange, String avgRating, String pictureLink, boolean eatIn, boolean takeAway) {
        this.id = id;
        this.restaurantName = restaurantName;
        this.cuisineType = cuisineType;
        this.priceRange = priceRange;
        this.avgRating = avgRating;
        this.pictureLink = pictureLink;
        this.eatIn = eatIn;
        this.takeAway = takeAway;
    }

    public int getId() {
        return id;
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

    public boolean isEatIn() {
        return eatIn;
    }

    public boolean isTakeAway() {
        return takeAway;
    }
}
