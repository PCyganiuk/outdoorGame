package com.psim.outdoorGame.routes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "routes")
@AllArgsConstructor
@NoArgsConstructor
public class Route {
    @Id
    private ObjectId routeId;
    private String routeName;
    private List<ObjectId> poiId;
}
