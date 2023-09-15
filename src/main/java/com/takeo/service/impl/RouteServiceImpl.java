package com.takeo.service.impl;

import com.takeo.model.Cargo;
import com.takeo.model.Route;
import com.takeo.service.RouteService;
import org.springframework.util.RouteMatcher;

public class RouteServiceImpl implements RouteService {
    @Override
    public boolean save() {
        return false;
    }

    @Override
    public boolean listAll() {
        return false;
    }

    @Override
    public Route findCargoById() {
        return null;
    }

    @Override
    public boolean update(int id) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }
}
