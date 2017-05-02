package com.luncheoniser.domain;

public class Restaurant {

    private final int id;
    private final String name;
    private final CuisineType cuisineType;
    private final PriceRange priceRange;
    private final double averageRating;
    private final String pictureLink;
    private final boolean eatIn;
    private final boolean takeAway;

    public Restaurant(int id, String name, CuisineType cuisineType, PriceRange priceRange, double averageRating, String pictureLink, boolean eatIn, boolean takeAway) {
        this.id = id;
        this.name = name;
        this.cuisineType = cuisineType;
        this.priceRange = priceRange;
        this.averageRating = averageRating;
        this.pictureLink = pictureLink;
        this.eatIn = eatIn;
        this.takeAway = takeAway;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public CuisineType getCuisineType() {
        return cuisineType;
    }

    public PriceRange getPriceRange() {
        return priceRange;
    }

    public double getAverageRating() {
        return averageRating;
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
