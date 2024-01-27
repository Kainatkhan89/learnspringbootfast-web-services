package com.kainat.learnspringbootfastwebservices.controllers.module;

import com.kainat.learnspringbootfastwebservices.dtos.module.ModuleDTO;
import com.kainat.learnspringbootfastwebservices.services.module.ModuleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/learning/modules")
public class ModuleController {
    private final ModuleService moduleService;

    public ModuleController(ModuleService moduleService) {
        this.moduleService = moduleService;
    }

    @GetMapping
    public List<ModuleDTO> getAllModules() {
        return this.moduleService.getAllModules();
    }
}
