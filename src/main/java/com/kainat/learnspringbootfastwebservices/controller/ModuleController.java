package com.kainat.learnspringbootfastwebservices.controller;

import com.kainat.learnspringbootfastwebservices.entities.Module;
import com.kainat.learnspringbootfastwebservices.repositories.ModuleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/modules")
public class ModuleController {
    private final ModuleRepository moduleRepository;

    @Autowired
    public ModuleController(ModuleRepository moduleRepository) {
        this.moduleRepository = moduleRepository;
    }

    @GetMapping
    public ResponseEntity<List<Module>> getModules() {
        List<Module> modules = this.moduleRepository.getAllWithTutorials();

        return ResponseEntity.ok(modules);
    }
}
