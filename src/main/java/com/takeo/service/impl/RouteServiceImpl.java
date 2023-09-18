package com.takeo.service.impl;

import com.takeo.model.Cargo;
import com.takeo.model.Route;
import com.takeo.repo.RouteRepo;
import com.takeo.service.CargoService;
import com.takeo.service.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.RouteMatcher;

import java.util.List;
import java.util.Optional;

@Service
public class RouteServiceImpl implements RouteService {

    @Autowired
    RouteRepo routeRepo;
    @Override
    public boolean save(Route route) {
       Route rou = routeRepo.save(route);
       if(rou!=null){
           return true;
       }
       return false;
    }

    @Override
    public List<Route> listAll() {
        List<Route> routes = routeRepo.findAll();
        if(routes!=null){
            return routes;
        }
        return null;
    }

    @Override
    public Route findRouteById(String id) {
        Optional<Route> optional = routeRepo.findById(id);
        Route route = optional.get();
        if(route!=null){
            return route;
        }
        return null;
    }

    @Override
    public boolean update(Route route) {
        return save(route);
    }

    @Override
    public boolean delete(String id) {
       Route route = findRouteById(id);
       if(route!=null){
           routeRepo.delete(route);
           return true;
       }
       return false;
    }
}
