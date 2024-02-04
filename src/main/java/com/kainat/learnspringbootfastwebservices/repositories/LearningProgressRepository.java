package com.kainat.learnspringbootfastwebservices.repositories;

import com.kainat.learnspringbootfastwebservices.entities.CompletedTutorial;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LearningProgressRepository extends JpaRepository<CompletedTutorial, Integer> {
    public List<CompletedTutorial> findByUserId(String userId);
}
