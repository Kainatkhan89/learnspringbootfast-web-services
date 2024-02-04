package com.kainat.learnspringbootfastwebservices.controllers;

import com.kainat.learnspringbootfastwebservices.dtos.SaveUserRequest;
import com.kainat.learnspringbootfastwebservices.entities.User;
import com.kainat.learnspringbootfastwebservices.mappers.UserMapper;
import com.kainat.learnspringbootfastwebservices.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping(value = "save")
    public ResponseEntity<User> saveUser(SaveUserRequest saveUserRequest) {
        User userToSave = UserMapper.toUser(saveUserRequest);
        User savedUser = this.userService.saveUser(userToSave);

        return ResponseEntity.ok(savedUser);
    }
}
