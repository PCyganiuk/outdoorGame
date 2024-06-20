package com.psim.outdoorGame.achievements;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "achievements")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Achievement {
    @Id
    private ObjectId achievementId;
    private Integer time; // given in seconds
    private Integer userId;
    private Date date;
    private Integer poiId;
}
