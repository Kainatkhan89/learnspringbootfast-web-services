package com.kainat.learnspringbootfastwebservices.controllers;

import com.kainat.learnspringbootfastwebservices.dtos.UpdateProgressRequest;
import com.kainat.learnspringbootfastwebservices.entities.CompletedTutorial;
import com.kainat.learnspringbootfastwebservices.services.LearningProgressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/learning-progress")
public class LearningProgressController {
    private final LearningProgressService learningProgressService;

    @Autowired
    public LearningProgressController(LearningProgressService learningProgressService) {
        this.learningProgressService = learningProgressService;
    }

    @GetMapping()
    public ResponseEntity<List<CompletedTutorial>> getUserProgress() {
        return null;
    }

    public ResponseEntity<CompletedTutorial> updateUserProgress(@RequestBody UpdateProgressRequest updateProgressRequest) {
        return null;
    }
}
