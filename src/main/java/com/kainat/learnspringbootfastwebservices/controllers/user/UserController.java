package com.kainat.learnspringbootfastwebservices.controllers.user;

import com.kainat.learnspringbootfastwebservices.dtos.user.SaveUserDTO;
import com.kainat.learnspringbootfastwebservices.entities.user.User;
import com.kainat.learnspringbootfastwebservices.services.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public User saveUser(@RequestBody SaveUserDTO saveUserDTO) {
        return this.userService.saveUser(saveUserDTO);
    }
}
