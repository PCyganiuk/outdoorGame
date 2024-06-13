package com.psim.outdoorGame.routes;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/routes")
public class RouteController {
    @Autowired
    private RouteService routeService;

    @GetMapping
    public ResponseEntity<List<Route>> getAllRoutes(){
        return new ResponseEntity<>(routeService.findAllRoutes(), HttpStatus.OK);
    }
    @GetMapping("/{routeId}")
    public ResponseEntity<List<Route>> getSingleRoute(@PathVariable ObjectId routeId){
        return new ResponseEntity<>(routeService.findSingleRoute(routeId),HttpStatus.OK);
    }
}
