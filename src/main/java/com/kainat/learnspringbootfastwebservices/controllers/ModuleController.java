package com.kainat.learnspringbootfastwebservices.controllers;

import com.kainat.learnspringbootfastwebservices.entities.Module;
import com.kainat.learnspringbootfastwebservices.repositories.ModuleRepository;
import com.kainat.learnspringbootfastwebservices.services.ModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/modules")
public class ModuleController {
    private final ModuleService moduleService;

    @Autowired
    public ModuleController(ModuleService moduleService) {
        this.moduleService = moduleService;
    }

    @GetMapping
    public ResponseEntity<List<Module>> getModules() {
        List<Module> modules = this.moduleService.getAllModulesWithTheirTutorials();

        return ResponseEntity.ok(modules);
    }
}
