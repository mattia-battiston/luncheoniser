package com.luncheoniser.domain;

public class Restaurant {

    private final String name;
    private final CuisineType cuisineType;
    private final PriceRange priceRange;
    private final double averageRating;
    private final String pictureLink;
    private final EatingLocation eatingLocation;

    public Restaurant(String name, CuisineType cuisineType, PriceRange priceRange, double averageRating, String pictureLink, EatingLocation eatingLocation) {
        this.name = name;
        this.cuisineType = cuisineType;
        this.priceRange = priceRange;
        this.averageRating = averageRating;
        this.pictureLink = pictureLink;
        this.eatingLocation = eatingLocation;
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

    public EatingLocation getEatingLocation() {
        return eatingLocation;
    }
}
