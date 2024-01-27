package com.kainat.learnspringbootfastwebservices.services.user;

import com.kainat.learnspringbootfastwebservices.dtos.user.SaveUserDTO;
import com.kainat.learnspringbootfastwebservices.entities.user.User;
import com.kainat.learnspringbootfastwebservices.repositories.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FirebaseUserService implements UserService {
    private final UserRepository userRepository;

    @Autowired
    public FirebaseUserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User saveUser(SaveUserDTO saveUserDTO) {
        User user = new User();

        user.setFirebaseId(saveUserDTO.getFirebaseId());
        user.setEmail(saveUserDTO.getEmail());

        return this.userRepository.save(user);
    }
}
