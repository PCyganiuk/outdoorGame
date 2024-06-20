package com.psim.outdoorGame.achievements;

import com.psim.outdoorGame.user.PostResponse;
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
    @GetMapping
    public ResponseEntity<List<Achievement>> getAchievements(){
        return new ResponseEntity<>(achievementService.getAll(), HttpStatus.OK);
    }
    @GetMapping("/{userId}")
    public ResponseEntity<List<Achievement>> getAchievementsByUserId(@PathVariable ObjectId userId){
        return new ResponseEntity<>(achievementService.byUserId(userId), HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<PostResponse> postAchievement(@RequestBody Achievement achievement){
        achievementService.saveAchievement(achievement);
        return ResponseEntity.ok(new PostResponse("added successfully"));
    }
}
