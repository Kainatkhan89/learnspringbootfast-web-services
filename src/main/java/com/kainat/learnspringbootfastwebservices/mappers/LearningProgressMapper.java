package com.kainat.learnspringbootfastwebservices.mappers;

import com.kainat.learnspringbootfastwebservices.dtos.UpdateProgressRequest;
import com.kainat.learnspringbootfastwebservices.entities.CompletedTutorial;

public class LearningProgressMapper {
    public static CompletedTutorial toCompletedTutorial(UpdateProgressRequest updateProgressRequest) {
        CompletedTutorial completedTutorial = new CompletedTutorial();

        completedTutorial.setUserId(updateProgressRequest.getUserId());
        completedTutorial.setCompletedTutorialId(updateProgressRequest.getCompletedTutorialId());

        return completedTutorial;
    }
}
