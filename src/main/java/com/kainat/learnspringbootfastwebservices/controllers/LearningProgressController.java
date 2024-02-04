package com.kainat.learnspringbootfastwebservices.controllers;

import com.kainat.learnspringbootfastwebservices.dtos.UpdateProgressRequest;
import com.kainat.learnspringbootfastwebservices.entities.CompletedTutorial;
import com.kainat.learnspringbootfastwebservices.services.LearningProgressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/learning-progress")
public class LearningProgressController {
    private final LearningProgressService learningProgressService;

    @Autowired
    public LearningProgressController(LearningProgressService learningProgressService) {
        this.learningProgressService = learningProgressService;
    }

    @GetMapping("/{userId}")
    public ResponseEntity<List<CompletedTutorial>> getUserProgress(@PathVariable String userId) {
        List<CompletedTutorial> userCompletedTutorials = this.learningProgressService.getUserProgress(userId);
        return ResponseEntity.ok(userCompletedTutorials);
    }

    public ResponseEntity<CompletedTutorial> updateUserProgress(@RequestBody UpdateProgressRequest updateProgressRequest) {
        return null;
    }
}
