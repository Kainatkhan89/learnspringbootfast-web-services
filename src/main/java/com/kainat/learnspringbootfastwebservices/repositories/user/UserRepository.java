package com.kainat.learnspringbootfastwebservices.repositories.user;

import com.kainat.learnspringbootfastwebservices.entities.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
}