package com.kainat.learnspringbootfastwebservices.repositories;

import com.kainat.learnspringbootfastwebservices.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<String, User> {
}
