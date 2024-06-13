package com.psim.outdoorGame.routes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "routes")
@AllArgsConstructor
@NoArgsConstructor
public class Route {
    private ObjectId routeId;
    private ObjectId poiId;
    private Integer stopId;
}
