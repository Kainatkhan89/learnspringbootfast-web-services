package com.kainat.learnspringbootfastwebservices.repositories.user;

import com.kainat.learnspringbootfastwebservices.entities.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}