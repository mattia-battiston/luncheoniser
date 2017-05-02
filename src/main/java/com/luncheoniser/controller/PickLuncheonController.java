package com.luncheoniser.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class PickLuncheonController {

    @RequestMapping("/pickluncheon")
    @ResponseBody
    String home() {
        return "Hello World!";
    }

}