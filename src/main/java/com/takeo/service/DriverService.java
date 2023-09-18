package com.takeo.service;


import com.takeo.model.Driver;


import java.util.List;


public interface DriverService {
    public boolean save(Driver driver);
    public List<Driver> listAll();
    public Driver findDriverById(String id);
    public boolean update(Driver driver);
    public boolean delete(String id);
}
