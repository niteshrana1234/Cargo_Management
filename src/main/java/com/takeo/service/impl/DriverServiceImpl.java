package com.takeo.service.impl;

import com.takeo.model.Cargo;
import com.takeo.model.Driver;
import com.takeo.repo.DriverRepo;
import com.takeo.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DriverServiceImpl implements DriverService {

    @Autowired
    private DriverRepo driverRepo;
    @Override
    public boolean save(Driver driver) {
       Driver dvr = driverRepo.save(driver);
       boolean flag = false;
       if(dvr!=null){
           flag = true;
       }
        return flag;
    }

    @Override
    public List<Driver> listAll() {

        return  driverRepo.findAll();
    }

    @Override
    public Driver findDriverById(String id) {
        Optional<Driver> drv =  driverRepo.findById(id);
        Driver driver = null;
        if(drv!=null){
            driver = drv.get();
        }
        return driver;
    }

    @Override
    public boolean update(Driver driver) {

      return save(driver);
    }

    @Override
    public boolean delete(String id) {
        Driver driver = findDriverById(id);
        boolean flag = false;
        if(driver!=null){
            driverRepo.delete(driver);
            flag = true;
        }
        return flag;
    }
}
