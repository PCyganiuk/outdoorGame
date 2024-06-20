package com.psim.outdoorGame.achievements;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AchievementService {
    @Autowired
    private AchievementRepository achievementRepository;

    public List<Achievement> byUserId(ObjectId userId){
        return achievementRepository.findAchievementsByUserId(userId);
    }

    public List<Achievement> getAll(){
        return achievementRepository.findAll();
    }

    public void saveAchievement(Achievement achievement){
        achievementRepository.save(achievement);
    }
}
