package com.takeo.service.impl;

import com.takeo.model.Cargo;
import com.takeo.repo.CargoRepo;
import com.takeo.service.CargoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CargoServiceImpl implements CargoService {

    @Autowired
    private CargoRepo cargoRepo;
    @Override
    public boolean save(Cargo cargo) {
        Cargo carg = cargoRepo.save(cargo);
        if(carg!=null){
            return true;
        }
        return false;
    }

    @Override
    public List<Cargo> listAll() {

        return cargoRepo.findAll();
    }

    @Override
    public Cargo findCargoById(String id) {
        Cargo cargo = cargoRepo.findById(id).get();
        if(cargo!=null){
            return  cargo;
        }
        return null;
    }

    @Override
    public boolean update(Cargo cargo) {
        return save(cargo);
    }

    @Override
    public boolean delete(String id) {
       Cargo cargo = findCargoById(id);
        if(cargo!=null){
            cargoRepo.delete(cargo);
            return true;
        }
        return false;
    }
}
