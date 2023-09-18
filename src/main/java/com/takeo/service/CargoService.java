package com.takeo.service;

import com.takeo.model.Cargo;

import java.util.List;


public interface CargoService {

    public boolean save(Cargo cargo);
    public List<Cargo> listAll();
    public Cargo findCargoById(String id);
    public boolean update(Cargo cargo);
    public boolean delete(String id);
}
