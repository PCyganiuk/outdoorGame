package com.psim.outdoorGame.routes;

import com.psim.outdoorGame.user.PostResponse;
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

    @PostMapping
    public ResponseEntity<PostResponse> postRoute(@RequestBody Route route){
        routeService.saveRoute(route);
        return ResponseEntity.ok(new PostResponse("added successfully"));
    }
}
