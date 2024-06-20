package com.psim.outdoorGame.poi;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/points-of-interest")
public class PointsOfInterestController {
    @Autowired
    PointsOfInterestService pointsOfInterestService;

    @GetMapping
    public ResponseEntity<List<PointsOfInterest>> getAll(){
        return new ResponseEntity<>(pointsOfInterestService.allPoIs(), HttpStatus.OK);
    }

    @GetMapping("/{poiId}")
    public ResponseEntity<Optional<PointsOfInterest>> getById(@PathVariable Integer poiId){
        return new ResponseEntity<>(pointsOfInterestService.singlePoI(poiId),HttpStatus.OK);
    }
}
