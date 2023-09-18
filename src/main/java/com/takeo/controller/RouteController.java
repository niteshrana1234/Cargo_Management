package com.takeo.controller;

import com.takeo.model.Route;
import com.takeo.service.impl.RouteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class RouteController {
    @Autowired
    RouteServiceImpl routeService;

    @RequestMapping("/createRoute")
    public String loadForm(Model model){

        model.addAttribute("route",new Route());

        return "route-create";
    }

    @RequestMapping("/saveRoute")
    public String saveRoute(@ModelAttribute("route") Route route, Model model){
        String msg = "";
       boolean rout = routeService.save(route);
        if(rout){
            msg = "Insertion successful !!!";
        } else {
            msg = "Insertion failed !!!";
        }
        model.addAttribute("msg",msg);
        model.addAttribute("route",new Route());
        return "route-create";
    }

    @RequestMapping("viewAllRoute")
    public String listAll(Model model){
List<Route> routeList = routeService.listAll();
if(routeList!=null){
    model.addAttribute("listRoute",routeList);
    }
        return "rview";
    }

    @RequestMapping("goBackRoute")
    public String goBack(){

        return "redirect:/createRoute";
    }

    @RequestMapping("/editRoute")
    public String routeEdit(@RequestParam("id") String id, Model model ){
       Route route = routeService.findRouteById(id);
       if(route!=null){
           model.addAttribute("route",route);
       }
        return "route-edit";
    }

    @RequestMapping("/updateRoute")
    public String updateRoute(@ModelAttribute("route") Route route){
       boolean check = routeService.update(route);
        if(check){
            return "redirect:/viewAllRoute";
        }
        return null;
    }

    @RequestMapping("/deleteRoute")
    public String deleteRoute(@RequestParam("id") String id){
    boolean flag = routeService.delete(id);
        if(flag){
            return "redirect:/viewAllRoute";
        }
     return null;
    }


}
