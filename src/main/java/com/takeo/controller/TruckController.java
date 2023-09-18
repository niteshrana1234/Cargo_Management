package com.takeo.controller;

import com.takeo.model.Driver;
import com.takeo.model.Truck;
import com.takeo.service.impl.TruckServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class TruckController {
    @Autowired
    private TruckServiceImpl truckService;

    @RequestMapping("/createTruck")
    public String loadForm(Model model) {
        Truck truck = new Truck();
        model.addAttribute("truck", truck);
        return "truck-create";
    }

    @RequestMapping("/saveTruck")
    public String saveTruck(@ModelAttribute("truck") Truck truck, Model model) {
        boolean flag = truckService.save(truck);
        String msg = "";
        if (flag) {
            msg = "Registration Successful !!!";
        } else {
            msg = "Registration Failed !!!";
        }
        model.addAttribute("msg", msg);
        model.addAttribute("truck",new Truck());
        return "truck-create";
    }

    @RequestMapping("/viewAllTruck")
    public String listTruck(Model model) {
        List<Truck> truckList = truckService.listAll();
        if (truckList != null) {
            model.addAttribute("listTruck", truckList);
        }
        return "tview";
    }

    @RequestMapping("/goBackTruck")
    public String goBack(){

        return "redirect:/createTruck";
    }
    @RequestMapping("/editTruck")
    public String  editTruck(@RequestParam("id") String id, Model model){
        Truck truck = truckService.findTruckById(id);
        model.addAttribute("truck",truck);
        return "truck-edit";
    }

    @RequestMapping("/updateTruck")
    public String updateTruck(@ModelAttribute("truck") Truck truck){
        truckService.update(truck);
        return "redirect:/viewAllTruck";
    }

    @RequestMapping("/deleteTruck")
    public String deleteTruck(@RequestParam("id") String id){
       boolean flag = truckService.delete(id);
        if(flag){
            return "redirect:/viewAllTruck";
        }
        return null;
    }

}
