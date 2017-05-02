
$(document).ready(function(){
    $("#randomise").click(function(){

        $.getJSON("/luncheoniser/pickluncheon", function( restaurantDetails ) {

            var restaurantName = "";
            var cuisineType = "";
            var priceRange = "";
            var avgRating = "";
            var pictureLink = "";
            var eatIn = "";
            var takeAway = "";

            $.each( restaurantDetails, function( key, val ) {
                switch (key) {
                    case ("restaurantName"):
                        restaurantName =  "<h2 id='" + key + "'>" + val + "</h2>" ;
                        break;
                    case ("pictureLink"):
                        pictureLink =  "<img id='" + key + "' src='" + val + "' alt='restaurant_img' class='restaurantPicture' />" ;
                        break;
                    case ("cuisineType"):
                        cuisineType =   "<p id='" + key + "'>Cuisine: " + val + "</p>" ;
                        break;
                    case ("priceRange"):
                        priceRange =   "<p id='" + key + "'>Price Range: £" + val + "</p>" ;
                        break;
                    case ("avgRating"):
                        avgRating =   "<p id='" + key + "'>Avg Rating: " + val + "</p>" ;
                        break;
                    case ("eatIn"):
                        eatIn = val;
                        break;
                    case ("takeAway"):
                        takeAway = val;
                        break;
                }
            });

            $("#results").append(restaurantName);
            $("#results").append(pictureLink);
            $("#results").append(cuisineType);
            $("#results").append(priceRange);
            $("#results").append(avgRating);
            if(eatIn) {
                $("#results").append("<p><i class='fa fa-cutlery fa-lg'></i></p>");
            }
            if(takeAway) {
                $("#results").append("<p><i class='fa fa-home fa-lg'></i></p>");
            }

        });
    });
});