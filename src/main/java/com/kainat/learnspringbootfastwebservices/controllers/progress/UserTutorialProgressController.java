package com.kainat.learnspringbootfastwebservices.controllers.progress;

import com.kainat.learnspringbootfastwebservices.dtos.progress.CompletedTutorialDTO;
import com.kainat.learnspringbootfastwebservices.dtos.progress.ProgressUpdateRequest;
import com.kainat.learnspringbootfastwebservices.entities.progress.UserTutorialProgress;
import com.kainat.learnspringbootfastwebservices.services.progress.UserTutorialProgressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/completed-tutorials/{userId}")
    public List<CompletedTutorialDTO> getCompletedTutorials(@PathVariable String userId) {
        return this.userTutorialProgressService.getCompletedTutorialsByUser(userId);
    }
}
