package com.takeo.service.impl;

import com.takeo.model.Cargo;
import com.takeo.model.Truck;
import com.takeo.repo.TruckRepo;
import com.takeo.service.TruckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TruckServiceImpl implements TruckService {

    @Autowired
    private TruckRepo truckRepo;

    @Override
    public boolean save(Truck truck) {
        Truck trk = truckRepo.save(truck);
        if (trk != null) {
            return true;
        }
        return false;
    }

    @Override
    public List<Truck> listAll() {
        List<Truck> trucks = truckRepo.findAll();
        return trucks;
    }

    @Override
    public Truck findTruckById(String id) {
        Optional<Truck> optional = truckRepo.findById(id);
        Truck truck = optional.get();
        if (truck != null) {
            return truck;
        }
        return null;
    }

    @Override
    public boolean update(Truck truck) {

       return save(truck);
    }

    @Override
    public boolean delete(String id) {
        Truck truck = findTruckById(id);
        if(truck!=null){
            truckRepo.delete(truck);
            return true;
        }
        return false;
    }
}
