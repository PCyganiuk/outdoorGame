package com.psim.outdoorGame.routes;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RouteRepository extends MongoRepository<Route, ObjectId> {
    List<Route> findRoutesByRouteId(ObjectId routeId);
}
