package com.kainat.learnspringbootfastwebservices.controllers.tutorial;

import com.kainat.learnspringbootfastwebservices.entities.tutorial.Tutorial;
import com.kainat.learnspringbootfastwebservices.repositories.tutorial.TutorialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("learning/tutorials")
public class TutorialController {
    private final TutorialRepository tutorialRepository;

    @Autowired
    public TutorialController(TutorialRepository tutorialRepository) {
        this.tutorialRepository = tutorialRepository;
    }

    @GetMapping
    public List<Tutorial> getAllTutorials() {
        return this.tutorialRepository.findAll();
    }
}
