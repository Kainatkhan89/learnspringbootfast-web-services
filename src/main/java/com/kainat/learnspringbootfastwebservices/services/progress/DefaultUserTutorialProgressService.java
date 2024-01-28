package com.kainat.learnspringbootfastwebservices.services.progress;

import com.kainat.learnspringbootfastwebservices.dtos.progress.CompletedTutorialDTO;
import com.kainat.learnspringbootfastwebservices.dtos.progress.ProgressUpdateRequest;
import com.kainat.learnspringbootfastwebservices.entities.progress.UserTutorialProgress;
import com.kainat.learnspringbootfastwebservices.entities.tutorial.Tutorial;
import com.kainat.learnspringbootfastwebservices.entities.user.User;
import com.kainat.learnspringbootfastwebservices.mappers.TutorialMapper;
import com.kainat.learnspringbootfastwebservices.repositories.progress.UserTutorialProgressRepository;
import com.kainat.learnspringbootfastwebservices.repositories.tutorial.TutorialRepository;
import com.kainat.learnspringbootfastwebservices.repositories.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DefaultUserTutorialProgressService implements UserTutorialProgressService {
    private final UserTutorialProgressRepository userTutorialProgressRepository;
    private final UserRepository userRepository;
    private final TutorialRepository tutorialRepository;
    private final TutorialMapper tutorialMapper;

    @Autowired
    public DefaultUserTutorialProgressService(UserTutorialProgressRepository userTutorialProgressRepository, UserRepository userRepository, TutorialRepository tutorialRepository, TutorialMapper tutorialMapper) {
        this.userTutorialProgressRepository = userTutorialProgressRepository;
        this.userRepository = userRepository;
        this.tutorialRepository = tutorialRepository;
        this.tutorialMapper = tutorialMapper;
    }

    @Override
    public UserTutorialProgress markTutorialAsCompleted(ProgressUpdateRequest progressUpdateRequest) {
        UserTutorialProgress userTutorialProgress = new UserTutorialProgress();

        String userId = progressUpdateRequest.getUserId();
        int tutorialId = progressUpdateRequest.getCompletedTutorialId();

        User user = this.userRepository.findById(userId).orElseThrow(() -> new RuntimeException("User not found"));
        Tutorial tutorial = this.tutorialRepository.findById(tutorialId).orElseThrow(() -> new RuntimeException("Tutorial not found"));

        userTutorialProgress.setUser(user);
        userTutorialProgress.setTutorial(tutorial);

        return this.userTutorialProgressRepository.save(userTutorialProgress);
    }

    @Override
    public List<CompletedTutorialDTO> getCompletedTutorialsByUser(String userId) {
        List<UserTutorialProgress> userProgresses = this.userTutorialProgressRepository.findByUserId(userId);

        return userProgresses.stream().map(userProgress -> this.tutorialMapper.tutorialToCompletedTutorialDTO(userProgress.getTutorial())).collect(Collectors.toList());
    }
}
