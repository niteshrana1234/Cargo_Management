package com.takeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RouteController {
    @RequestMapping("/createRoute")
    public String loadForm(){

        return "route-create";
    }
}
