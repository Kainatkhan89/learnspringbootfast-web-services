package com.kainat.learnspringbootfastwebservices.mappers;

import com.kainat.learnspringbootfastwebservices.dtos.SaveUserRequest;
import com.kainat.learnspringbootfastwebservices.entities.User;

public class UserMapper {
    public static User toUser(SaveUserRequest saveUserRequest) {
        User user = new User();

        user.setUserId(saveUserRequest.getUserId());
        user.setEmail(saveUserRequest.getEmail());

        return user;
    }
}
