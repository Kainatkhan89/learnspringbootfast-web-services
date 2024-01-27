package com.kainat.learnspringbootfastwebservices.services.user;

import com.kainat.learnspringbootfastwebservices.dtos.user.SaveUserDTO;
import com.kainat.learnspringbootfastwebservices.entities.user.User;

public interface UserService {
    User saveUser(SaveUserDTO saveUserDTO);
}
