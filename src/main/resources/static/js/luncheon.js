function displayBoolean(param) {
    if (param == true) {

    } else {

    }
}


$(document).ready(function(){
    $("#randomise").click(function(){

        $.getJSON("/luncheoniser/pickluncheon", function( restaurantDetails ) {

            var restaurantName;
            var cuisineType;
            var priceRange;
            var avgRating;
            var pictureLink;
            var eatIn;
            var takeAway;

            $.each( restaurantDetails, function( key, val ) {
                switch (key) {
                    case ("restaurantName"):
                        restaurantName =  "<h2 id='" + key + "'>Restaurant Name: " + val + "</h2>" ;
                        break;
                    case ("pictureLink"):
                        pictureLink =  "<img id='" + key + "' src='" + val + "' alt='restaurant_img'>" ;
                        break;
                    case ("cuisineType"):
                        cuisineType =   "<p id='" + key + "'>Cuisine Type: " + val + "</p>" ;
                        break;
                    case ("priceRange"):
                        priceRange =   "<p id='" + key + "'>Price Range: £" + val + "</p>" ;
                        break;
                    case ("avgRating"):
                        avgRating =   "<p id='" + key + "'>Avg Rating: " + val + "</p>" ;
                        break;
                    case ("eatIn"):
                        eatIn =   "<p id='" + key + "'>Eat In: " + displayBoolean(val) + "</p>" ;
                        break;
                    case ("takeAway"):
                        takeAway =   "<p id='" + key + "'>Take Away: " + val + "</p>" ;
                        break;
                }
            });

            $("#results").append(restaurantName);
            $("#results").append(pictureLink);
            $("#results").append(cuisineType);
            $("#results").append(priceRange);
            $("#results").append(avgRating);
            if(eatIn) {
                $("#results").append(eatIn);
            }
            if(takeAway) {
                $("#results").append(takeAway);
            }

        });
    });
});