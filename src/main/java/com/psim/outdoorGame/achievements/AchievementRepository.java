package com.psim.outdoorGame.achievements;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AchievementRepository extends MongoRepository<Achievement, ObjectId> {
    List<Achievement> findAchievementsByUserId(Integer userId);
}
