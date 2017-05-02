package com.luncheoniser.domain.builder;

import com.luncheoniser.domain.CuisineType;
import com.luncheoniser.domain.EatingLocation;
import com.luncheoniser.domain.PriceRange;
import com.luncheoniser.domain.Restaurant;

public class RestaurantBuilder {

    private String name;
    private CuisineType cuisineType;
    private PriceRange priceRange;
    private double averageRating;
    private String pictureLink;
    private EatingLocation eatingLocation;


    public Restaurant build() {
        return new Restaurant(name, cuisineType, priceRange, averageRating, pictureLink, eatingLocation);
    }

    public RestaurantBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public RestaurantBuilder withCuisineType(CuisineType cuisineType) {
        this.cuisineType = cuisineType;
        return this;
    }

    public RestaurantBuilder withPriceRange(PriceRange priceRange) {
        this.priceRange = priceRange;
        return this;
    }

    public RestaurantBuilder withAverageRating(double averageRating) {
        this.averageRating = averageRating;
        return this;
    }

    public RestaurantBuilder withPictureLink(String pictureLink) {
        this.pictureLink = pictureLink;
        return this;
    }

    public RestaurantBuilder withEatingLocation(EatingLocation eatingLocation) {
        this.eatingLocation = eatingLocation;
        return this;
    }


}
