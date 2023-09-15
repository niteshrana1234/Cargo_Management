package com.takeo.service;


import com.takeo.model.Route;

public interface RouteService {
    public boolean save();
    public boolean listAll();
    public Route findCargoById();
    public boolean update(int id);
    public boolean delete(int id);
}
