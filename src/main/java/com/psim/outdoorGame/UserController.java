package com.psim.outdoorGame;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.neo4j.Neo4jProperties;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping
    public ResponseEntity<List<User>> getAllUsers(){
        return new ResponseEntity<List<User>>(userService.allUsers(),HttpStatus.OK);
    }

    @GetMapping("/{username}")
    public ResponseEntity<Optional<User>> getSingleUser(@PathVariable String username){
        return new ResponseEntity<Optional<User>>(userService.singleUser(username),HttpStatus.OK);
    }
    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody User user){
        Optional<User> isUser = userService.byUsernameAndPassword(user.getUsername(),user.getPassword());
        if (isUser.isPresent()){
            return ResponseEntity.ok("login successful");
        }
        else{
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid login or password");
        }
    }

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody User user){
        Optional<User> isUser = userService.singleUser(user.getUsername());
        if (isUser.isPresent()){
            return ResponseEntity.badRequest().body("Username is already taken");
        }
        else{
            userService.saveUser(user);
            return ResponseEntity.ok("User registered successfully");
        }
    }
}
