package com.takeo.service;

import com.takeo.model.Truck;

import java.util.List;

public interface TruckService {
    public boolean save(Truck truck);
    public List<Truck> listAll();
    public Truck findTruckById(String id);
    public boolean update(Truck truck);
    public boolean delete(String id);
}
