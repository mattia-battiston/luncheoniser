package com.luncheoniser.domain.builder;

import com.luncheoniser.domain.CuisineType;
import com.luncheoniser.domain.PriceRange;
import com.luncheoniser.domain.Restaurant;

public class RestaurantBuilder {

    private int id;
    private String name;
    private CuisineType cuisineType;
    private PriceRange priceRange;
    private double averageRating;
    private String pictureLink;
    private boolean eatIn;
    private boolean takeAway;

    public Restaurant build() {
        return new Restaurant(id, name, cuisineType, priceRange, averageRating, pictureLink, eatIn, takeAway);
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

    public RestaurantBuilder canEatIn() {
        this.eatIn = true;
        return this;
    }

    public RestaurantBuilder canTakeAway() {
        this.takeAway = true;
        return this;
    }

    public RestaurantBuilder withId(int id) {
        this.id = id;
        return this;
    }
}
