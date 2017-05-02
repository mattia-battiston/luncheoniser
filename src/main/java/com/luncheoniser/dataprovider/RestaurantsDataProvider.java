package com.luncheoniser.dataprovider;

import com.luncheoniser.domain.CuisineType;
import com.luncheoniser.domain.PriceRange;
import com.luncheoniser.domain.Restaurant;
import com.luncheoniser.domain.builder.RestaurantBuilder;
import com.luncheoniser.usecase.GetAllLocalRestaurants;
import org.springframework.stereotype.Component;

import java.util.List;

import static java.util.Arrays.asList;

@Component
public class RestaurantsDataProvider implements GetAllLocalRestaurants{

    @Override
    public List<Restaurant> getAllLocalRestaurants() {
        Restaurant tradeUnion = new RestaurantBuilder()
                .withName("Trade Union")
                .withCuisineType(CuisineType.BRITISH)
                .withPriceRange(new PriceRange(10, 20))
                .withAverageRating(3.0)
                .withPictureLink("https://media-cdn.tripadvisor.com/media/photo-o/0c/a8/10/cd/trade-union.jpg")
                .canEatIn()
                .build();

        Restaurant bibimbap = new RestaurantBuilder()
                .withName("Bibimbap")
                .withCuisineType(CuisineType.KOREAN)
                .withPriceRange(new PriceRange(3.5, 7))
                .withAverageRating(4.5)
                .withPictureLink("https://media-cdn.tripadvisor.com/media/photo-s/0a/a5/81/bb/bibimbap-to-go.jpg")
                .canTakeAway()
                .build();

        Restaurant pumblechooks = new RestaurantBuilder()
                .withName("Pumblechooks")
                .withCuisineType(CuisineType.BRITISH)
                .withPriceRange(new PriceRange(3.5, 8))
                .withAverageRating(3.8)
                .withPictureLink("https://media-cdn.tripadvisor.com/media/photo-s/04/ba/40/5c/pumblechook-s.jpg")
                .canEatIn()
                .canTakeAway()
                .build();

        return asList(tradeUnion, bibimbap, pumblechooks);
    }

}
