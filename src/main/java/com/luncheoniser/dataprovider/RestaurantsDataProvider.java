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
                .withId(1)
                .withName("Trade Union")
                .withCuisineType(CuisineType.BRITISH)
                .withPriceRange(new PriceRange(10, 20))
                .withAverageRating(3.0)
                .withPictureLink("https://media-cdn.tripadvisor.com/media/photo-o/0c/a8/10/cd/trade-union.jpg")
                .canEatIn()
                .build();

        Restaurant bibimbap = new RestaurantBuilder()
                .withId(2)
                .withName("Bibimbap")
                .withCuisineType(CuisineType.KOREAN)
                .withPriceRange(new PriceRange(3.5, 7))
                .withAverageRating(4.5)
                .withPictureLink("https://media-cdn.tripadvisor.com/media/photo-s/0a/a5/81/bb/bibimbap-to-go.jpg")
                .canTakeAway()
                .build();

        Restaurant pumblechooks = new RestaurantBuilder()
                .withId(3)
                .withName("Pumblechooks")
                .withCuisineType(CuisineType.BRITISH)
                .withPriceRange(new PriceRange(3.5, 8))
                .withAverageRating(3.8)
                .withPictureLink("https://media-cdn.tripadvisor.com/media/photo-s/04/ba/40/5c/pumblechook-s.jpg")
                .canEatIn()
                .canTakeAway()
                .build();

        Restaurant strada = new RestaurantBuilder()
                .withId(4)
                .withName("Strada")
                .withCuisineType(CuisineType.ITALIAN)
                .withPriceRange(new PriceRange(5, 20))
                .withAverageRating(4.2)
                .withPictureLink("https://media-cdn.tripadvisor.com/media/photo-s/08/af/70/70/strada-st-katharine-docks.jpg")
                .canEatIn()
                .canTakeAway()
                .build();

        Restaurant tomsKitchen = new RestaurantBuilder()
                .withId(5)
                .withName("Tom's Kitchen Deli")
                .withCuisineType(CuisineType.BRITISH)
                .withPriceRange(new PriceRange(5, 10))
                .withAverageRating(3.9)
                .withPictureLink("https://www.somersethouse.org.uk/sites/default/files/styles/header_image/public/Tom%27s%20Kitchen%20Somerset%20House%2010_HEADER.jpg?itok=NIOkKrz9")
                .canTakeAway()
                .build();

        Restaurant pret = new RestaurantBuilder()
                .withId(6)
                .withName("Pret")
                .withCuisineType(CuisineType.SANDWICHES)
                .withPriceRange(new PriceRange(3, 10))
                .withAverageRating(4.1)
                .withPictureLink("https://www.allinlondon.co.uk/images/venues/images_all/12543897.jpg")
                .canTakeAway()
                .canEatIn()
                .build();

        return asList(tradeUnion, bibimbap, pumblechooks, strada, tomsKitchen, pret);
    }

}
