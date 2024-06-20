package com.psim.outdoorGame.poi;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PointsOfInterestRepository extends MongoRepository<PointsOfInterest, ObjectId> {
    Optional<PointsOfInterest> findPointsOfInterestByPoiId(Integer poiId);
}
