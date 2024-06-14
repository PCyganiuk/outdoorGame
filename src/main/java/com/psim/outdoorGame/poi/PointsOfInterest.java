package com.psim.outdoorGame.poi;

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
    private String name;
    private Integer qrId;
    private String localization;
    private String hint;
}
