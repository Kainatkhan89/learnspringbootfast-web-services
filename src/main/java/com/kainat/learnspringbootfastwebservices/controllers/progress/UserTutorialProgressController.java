package com.kainat.learnspringbootfastwebservices.controllers.progress;

import com.kainat.learnspringbootfastwebservices.dtos.progress.ProgressUpdateRequest;
import com.kainat.learnspringbootfastwebservices.entities.progress.UserTutorialProgress;
import com.kainat.learnspringbootfastwebservices.services.progress.UserTutorialProgressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user-progress")
public class UserTutorialProgressController {
    private final UserTutorialProgressService userTutorialProgressService;

    @Autowired
    public UserTutorialProgressController(UserTutorialProgressService userTutorialProgressService) {
        this.userTutorialProgressService = userTutorialProgressService;
    }

    @PostMapping("/complete-tutorial")
    public UserTutorialProgress completeTutorial(@RequestBody ProgressUpdateRequest progressUpdateRequest) {
        return this.userTutorialProgressService.markTutorialAsCompleted(progressUpdateRequest);
    }
}
