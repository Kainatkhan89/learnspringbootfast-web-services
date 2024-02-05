package com.kainat.learnspringbootfastwebservices.services;

import com.kainat.learnspringbootfastwebservices.entities.CompletedTutorial;

import java.util.List;

public interface LearningProgressService {
    List<Integer> getUserCompletedTutorials(String userId);
    CompletedTutorial updateUserProgress(CompletedTutorial completedTutorial);
    void resetUserProgress(String userId);
}
