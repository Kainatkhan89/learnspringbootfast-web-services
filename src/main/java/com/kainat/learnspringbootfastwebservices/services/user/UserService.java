package com.kainat.learnspringbootfastwebservices.services.user;

import com.kainat.learnspringbootfastwebservices.dtos.user.SaveUserRequest;
import com.kainat.learnspringbootfastwebservices.entities.user.User;

public interface UserService {
    User saveUser(SaveUserRequest saveUserRequest);
}
