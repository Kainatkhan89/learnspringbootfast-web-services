package com.kainat.learnspringbootfastwebservices.services;

import com.kainat.learnspringbootfastwebservices.entities.CompletedTutorial;

import java.util.List;

public interface LearningProgressService {
    List<CompletedTutorial> getUserProgress(String userId);
    CompletedTutorial updateUserProgress(CompletedTutorial completedTutorial);
}
