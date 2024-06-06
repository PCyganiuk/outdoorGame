package com.psim.outdoorGame;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "PoI")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PointsOfInterest {
    @Id
    private ObjectId id;
    private Integer poiId;
    private String name;
    private Integer qr_id;
    private String localization;
    private String hint;
}
