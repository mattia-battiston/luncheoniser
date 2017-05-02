
function processResults (restaurantDetails) {
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
                pictureLink =  "<img id='" + key + "' src='" + val + "' alt='restaurant_img' class='img-responsive' />" ;
                break;
            case ("cuisineType"):
                cuisineType =   "<h3 id='" + key + "'>" + val + "</h3>" ;
                break;
            case ("priceRange"):
                priceRange =   "<h3 id='" + key + "'>" + val + "</h3>" ;
                break;
            case ("avgRating"):
                avgRating =  "<h3 id='" + key + "'>";
                for (i = 0; i < Math.round(val); i++) {
                    avgRating += "<i class='fa fa-star fa-lg'></i>";
                }
                avgRating +=  "</h3>" ;
                break;
            case ("eatIn"):
                eatIn = val;
                break;
            case ("takeAway"):
                takeAway = val;
                break;
        }
    });

    $("#results > #name").empty();
    $("#results > #picture").empty();
    $("#results > #details").empty();
    $("#results > #name").append(restaurantName);
    $("#results > #picture").append(pictureLink);
    $("#results > #details").append(cuisineType);
    $("#results > #details").append(priceRange);
    $("#results > #details").append(avgRating);
    if(eatIn) {
        $("#results > #details").append("<p><i class='fa fa-cutlery fa-2x'></i> EAT IN</p>");
    }
    if(takeAway) {
        $("#results > #details").append("<p><i class='fa fa-home fa-2x'></i> TAKEAWAY</p>");
    }
}


function showPizza() {
    var pizza =  "<img src='https://cdn.dribbble.com/users/12755/screenshots/1036842/pizza2.gif' class='img-responsive' />" ;
    $("#pizza").append(pizza);
}

function randomise() {
    $("#pizza").empty();

    $.getJSON("/luncheoniser/pickluncheon?eatingLocation=eatin,takeaway", function( restaurantDetails ) {
        processResults(restaurantDetails);
    });
}

function eatin() {
    $("#pizza").empty();

    $.getJSON("/luncheoniser/pickluncheon?eatingLocation=eatin", function( restaurantDetails ) {
        processResults(restaurantDetails);
    });
}

function takeaway() {
    $("#pizza").empty();

    $.getJSON("/luncheoniser/pickluncheon?eatingLocation=takeaway", function( restaurantDetails ) {
        processResults(restaurantDetails);
    });
}

$(document).ready(function(){
    $("#randomise").click(function(){
        showPizza();
        setTimeout(randomise, 3000);
    });

    $("#eatIn").click(function(){
        showPizza();
        setTimeout(eatin, 3000);
    });

    $("#takeaway").click(function(){
        showPizza();
        setTimeout(takeaway, 3000);
    });

});