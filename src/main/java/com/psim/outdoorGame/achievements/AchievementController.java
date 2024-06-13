package com.psim.outdoorGame.achievements;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/achievements")
public class AchievementController {
    @Autowired
    private AchievementService achievementService;
    @GetMapping("/{userId}")
    public ResponseEntity<List<Achievement>> getAchievementsByUserId(@PathVariable ObjectId userId){
        return new ResponseEntity<>(achievementService.byUserId(userId), HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<String> postAchievement(@RequestBody Achievement achievement){
        achievementService.saveAchievement(achievement);
        return ResponseEntity.ok("achievement added successfully");
    }
}
