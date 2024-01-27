package com.kainat.learnspringbootfastwebservices.controllers.module;

import com.kainat.learnspringbootfastwebservices.entities.module.Module;
import com.kainat.learnspringbootfastwebservices.repositories.module.ModuleRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/learning/modules")
public class ModuleController {
    private final ModuleRepository moduleRepository;

    public ModuleController(ModuleRepository moduleRepository) {
        this.moduleRepository = moduleRepository;
    }

    @GetMapping
    public List<Module> getAllModules() {
        return this.moduleRepository.findAll();
    }
}
