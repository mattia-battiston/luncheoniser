package com.luncheoniser.controller;

import com.luncheoniser.controller.dto.PickedRestaurant;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class PickLuncheonController {

    @RequestMapping("/pickluncheon")
    @ResponseBody
    public PickedRestaurant home() {
        return new PickedRestaurant("Trade Union", "Pub", "10-20", "3/5", "https://media-cdn.tripadvisor.com/media/photo-o/0c/a8/10/cd/trade-union.jpg");
    }

}