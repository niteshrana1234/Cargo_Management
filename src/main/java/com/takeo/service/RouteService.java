package com.takeo.service;


import com.takeo.model.Route;

import java.util.List;

public interface RouteService {
    public boolean save(Route route);
    public List<Route> listAll();
    public Route findRouteById(String id);
    public boolean update(Route route);
    public boolean delete(String id);
}
