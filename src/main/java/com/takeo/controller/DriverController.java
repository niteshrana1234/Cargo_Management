package com.takeo.controller;

import com.takeo.model.Driver;
import com.takeo.service.impl.DriverServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class DriverController {
    @Autowired
   private DriverServiceImpl driverServiceImpl;
    @RequestMapping("/createDriver")
    public String loadForm(Model model){
        Driver driver = new Driver();
        model.addAttribute("driver",driver);
        return "driver-create";
    }

    @RequestMapping("/saveDriver")
    public String saveDriver(@ModelAttribute("driver") Driver driver, Model model){
        boolean flag =  driverServiceImpl.save(driver);

        String msg = "";
        if(flag){
            msg = "Driver Inserted Successfully !!!";
        }
        else{
            msg = "Insertion Failed !!!";
        }
        model.addAttribute("msg",msg);
        return "driver-create";
    }

    @RequestMapping("/viewAllDriver")
    public String listDriver(Model model){
        List<Driver> dl = driverServiceImpl.listAll();
        model.addAttribute("listDriver",dl);
        return "dview";
    }
    @RequestMapping("/goBackDriver")
    public String goBackToRegistration(){

        return "redirect:/createDriver";
    }

    @RequestMapping("/editDriver")
    public String editDriver(@RequestParam("id") int id,Model model){

       Driver driver = driverServiceImpl.findDriverById(id);

        model.addAttribute("driver",driver);

        return "driver-edit";
    }

    @RequestMapping("/updateDriver")
    public String updateDriver(@ModelAttribute("driver") Driver driver){
        driverServiceImpl.update(driver);

        return "redirect:/viewAllDriver";
    }

    @RequestMapping("deleteDriver")
    public String deleteDriver(@RequestParam("id") int id){
      boolean flag = driverServiceImpl.delete(id);
      if(flag){
       return "redirect:/viewAllDriver";
    }
      return null;
    }
}
