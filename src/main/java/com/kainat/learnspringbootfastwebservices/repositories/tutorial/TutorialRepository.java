package com.kainat.learnspringbootfastwebservices.repositories.tutorial;

import com.kainat.learnspringbootfastwebservices.entities.tutorial.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TutorialRepository extends JpaRepository<Tutorial, Integer> {
}
