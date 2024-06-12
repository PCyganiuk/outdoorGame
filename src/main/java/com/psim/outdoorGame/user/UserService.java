package com.psim.outdoorGame.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public List<User> allUsers() {
        return userRepository.findAll();
    }

    public Optional<User> singleUser(String username) {
        return userRepository.findByUsername(username);
    }

   public Optional<User> byUsernameAndPassword(String username, String password) {
       return userRepository.findByUsernameAndPassword(username, password);
   }

   public void saveUser(User user) {
        userRepository.save(user);
   }
}
