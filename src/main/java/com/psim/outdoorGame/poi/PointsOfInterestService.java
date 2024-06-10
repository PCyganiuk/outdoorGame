package com.psim.outdoorGame.poi;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PointsOfInterestService {
    @Autowired
    PointsOfInterestRepository pointsOfInterestRepository;
    public List<PointsOfInterest> allPoIs(){
        return pointsOfInterestRepository.findAll();
    }

    public Optional<PointsOfInterest> singlePoI(ObjectId id){
        return pointsOfInterestRepository.findById(id);
    }


}
