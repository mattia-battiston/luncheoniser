package com.luncheoniser.dataprovider;

import com.luncheoniser.domain.CuisineType;
import com.luncheoniser.domain.PriceRange;
import com.luncheoniser.domain.Restaurant;
import com.luncheoniser.domain.builder.RestaurantBuilder;
import com.luncheoniser.usecase.GetAllLocalRestaurants;
import org.springframework.stereotype.Component;

import java.util.List;

import static com.luncheoniser.domain.EatingLocation.EAT_IN;
import static com.luncheoniser.domain.EatingLocation.TAKEAWAY;
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
                .withEatingLocation(EAT_IN)
                .build();

        Restaurant bibimbap = new RestaurantBuilder()
                .withName("Bibimbap")
                .withCuisineType(CuisineType.KOREAN)
                .withPriceRange(new PriceRange(3.5, 7))
                .withAverageRating(4.5)
                .withPictureLink("https://media-cdn.tripadvisor.com/media/photo-s/0a/a5/81/bb/bibimbap-to-go.jpg")
                .withEatingLocation(TAKEAWAY)
                .build();

        return asList(tradeUnion, bibimbap);
    }

}
