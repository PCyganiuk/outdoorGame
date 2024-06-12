package com.psim.outdoorGame.comments;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CommentService {
    @Autowired
    private CommentRepository commentRepository;

    public List<Comment> allComments(ObjectId poi_id){
        return commentRepository.findByPoiId(poi_id);
    }

    public void saveComment(Comment comment){
        commentRepository.save(comment);
    }
}
