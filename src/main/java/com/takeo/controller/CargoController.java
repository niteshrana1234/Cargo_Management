package com.takeo.controller;

import com.takeo.model.Cargo;
import com.takeo.service.impl.CargoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.util.List;

@Controller
public class CargoController {

    @Autowired
    private CargoServiceImpl cargoService;

    @RequestMapping("/createCargo")
    public String loadForm(Model model){

        Cargo cargo = new Cargo();
        model.addAttribute("cargo",cargo);

        return "cargo-create";
    }

    @RequestMapping("/saveCargo")
    public String saveCargo(@ModelAttribute("cargo") Cargo cargo, Model model){
        String msg="";
        boolean check = cargoService.save(cargo);
        if(check){
            msg="Insertion successful !!!";
        }
        else {
            msg = "Insertion failed !!!";
        }
        model.addAttribute("msg",msg);

        return "cargo-create";
    }

    @RequestMapping("/viewAllCargo")
    public String cargoList(Model model){
        List<Cargo> cl = cargoService.listAll();
        model.addAttribute("listCargo",cl);
        return "cview";
    }

    @RequestMapping("/editCargo")
    public String editCargo(@RequestParam("id") int id, Model model){

       Cargo cargo = cargoService.findCargoById(id);
       if(cargo!=null){
           model.addAttribute("cargo",cargo);
       }
       return "cargo-edit";
    }
    @RequestMapping("/goBackCargo")
    public String goBack(){

        return "redirect:/createCargo";

    }

    @RequestMapping("updateCargo")
    public String updateCargo(@ModelAttribute("cargo") Cargo cargo, Model model){

       boolean check = cargoService.update(cargo);
        String msg = "";
        if(check){
            msg = "List Of Cargo Updated !!!";
        }
        model.addAttribute("message",msg);

        return "redirect:/viewAllCargo";
    }

    @RequestMapping("/deleteCargo")
    public String deleteCargo(@RequestParam("id") int id){

      boolean check =  cargoService.delete(id);
      if(check){
          return "redirect:/viewAllCargo";
      }
      return null;
    }


}
