package com.takeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DriverController {
    @RequestMapping("/createDriver")
    public String loadForm(){

        return "driver-create";
    }
}
