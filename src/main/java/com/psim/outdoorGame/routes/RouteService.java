package com.psim.outdoorGame.routes;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RouteService {
    @Autowired
    private RouteRepository routeRepository;

    public List<Route> findAllRoutes(){
        return routeRepository.findAll();
    }

    public List<Route> findSingleRoute(ObjectId routeId){
        return routeRepository.findRoutesByRouteId(routeId);
    }

    public void saveRoute(Route route){
        routeRepository.save(route);
    }
}
