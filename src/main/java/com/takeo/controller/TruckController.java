package com.takeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TruckController {
    @RequestMapping("/createTruck")
    public String loadForm(){

        return "truck-create";
    }
}
