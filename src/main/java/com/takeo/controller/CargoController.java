package com.takeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CargoController {

    @RequestMapping("/createCargo")
    public String loadForm(){

        return "cargo-create";
    }


}
