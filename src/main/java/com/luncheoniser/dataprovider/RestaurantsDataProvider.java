package com.luncheoniser.dataprovider;

import com.luncheoniser.domain.CuisineType;
import com.luncheoniser.domain.PriceRange;
import com.luncheoniser.domain.Restaurant;
import com.luncheoniser.usecase.GetAllLocalRestaurants;
import org.springframework.stereotype.Component;

import java.util.List;

import static com.luncheoniser.domain.EatingLocation.EAT_IN;
import static java.util.Arrays.asList;

@Component
public class RestaurantsDataProvider implements GetAllLocalRestaurants{

    @Override
    public List<Restaurant> getAllLocalRestaurants() {
        Restaurant tradeUnion = new Restaurant("Trade Union", CuisineType.BRITISH, new PriceRange(10, 20), 3.0, "https://media-cdn.tripadvisor.com/media/photo-o/0c/a8/10/cd/trade-union.jpg", EAT_IN);

        return asList(tradeUnion);
    }

}
