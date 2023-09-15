package com.takeo.service;

import com.takeo.model.Truck;

public interface TruckService {
    public boolean save();
    public boolean listAll();
    public Truck findCargoById();
    public boolean update(int id);
    public boolean delete(int id);
}
