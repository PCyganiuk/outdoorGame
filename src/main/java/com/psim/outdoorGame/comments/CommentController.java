package com.psim.outdoorGame.comments;

import com.psim.outdoorGame.user.PostResponse;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/comments")
public class CommentController {
    @Autowired
    private CommentService commentService;

    @GetMapping("/{PoiId}")
    public ResponseEntity<List<Comment>> getAllComments(@PathVariable ObjectId PoiId){
        return new ResponseEntity<>(commentService.allComments(PoiId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<PostResponse> postComment(@RequestBody Comment comment){
        commentService.saveComment(comment);
        return ResponseEntity.ok(new PostResponse("added successfuly"));
    }

}
