package com.kainat.learnspringbootfastwebservices.controllers;

import com.kainat.learnspringbootfastwebservices.dtos.UpdateProgressRequest;
import com.kainat.learnspringbootfastwebservices.entities.CompletedTutorial;
import com.kainat.learnspringbootfastwebservices.mappers.LearningProgressMapper;
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
    public ResponseEntity<List<Integer>> getUserProgress(@PathVariable String userId) {
        List<Integer> userCompletedTutorialIds = this.learningProgressService.getUserCompletedTutorials(userId);
        return ResponseEntity.ok(userCompletedTutorialIds);
    }

    @PostMapping("/update")
    public ResponseEntity<CompletedTutorial> updateUserProgress(@RequestBody UpdateProgressRequest updateProgressRequest) {
        CompletedTutorial completedTutorialToSave = LearningProgressMapper.toCompletedTutorial(updateProgressRequest);
        CompletedTutorial savedCompletedTutorial = this.learningProgressService.updateUserProgress(completedTutorialToSave);

        return ResponseEntity.ok(savedCompletedTutorial);
    }
}
