package com.takeo.service;

import com.takeo.model.Cargo;
import org.springframework.stereotype.Service;

@Service
public interface CargoService {

    public boolean save();
    public boolean listAll();
    public Cargo findCargoById();
    public boolean update(int id);
    public boolean delete(int id);
}
