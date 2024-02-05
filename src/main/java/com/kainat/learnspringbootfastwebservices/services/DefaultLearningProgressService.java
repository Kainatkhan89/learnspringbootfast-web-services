package com.kainat.learnspringbootfastwebservices.services;

import com.kainat.learnspringbootfastwebservices.entities.CompletedTutorial;
import com.kainat.learnspringbootfastwebservices.repositories.LearningProgressRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DefaultLearningProgressService implements LearningProgressService {
    private final LearningProgressRepository learningProgressRepository;

    public DefaultLearningProgressService(LearningProgressRepository learningProgressRepository) {
        this.learningProgressRepository = learningProgressRepository;
    }

    @Override
    public List<Integer> getUserCompletedTutorials(String userId) {
        return this.learningProgressRepository.findCompletedTutorialIdsByUserId(userId);
    }

    @Override
    public CompletedTutorial updateUserProgress(CompletedTutorial completedTutorial) {
        return this.learningProgressRepository.save(completedTutorial);
    }

    @Override
    @Transactional
    public void resetUserProgress(String userId) {
        this.learningProgressRepository.deleteByUserId(userId);
    }
}
