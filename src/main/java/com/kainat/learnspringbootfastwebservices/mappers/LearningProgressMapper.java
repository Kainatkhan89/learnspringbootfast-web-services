package com.kainat.learnspringbootfastwebservices.mappers;

import com.kainat.learnspringbootfastwebservices.dtos.UpdateLearningProgressRequest;
import com.kainat.learnspringbootfastwebservices.entities.CompletedTutorial;

public class LearningProgressMapper {
    public static CompletedTutorial toCompletedTutorial(UpdateLearningProgressRequest updateLearningProgressRequest) {
        CompletedTutorial completedTutorial = new CompletedTutorial();

        completedTutorial.setUserId(updateLearningProgressRequest.getUserId());
        completedTutorial.setCompletedTutorialId(updateLearningProgressRequest.getCompletedTutorialId());

        return completedTutorial;
    }
}
