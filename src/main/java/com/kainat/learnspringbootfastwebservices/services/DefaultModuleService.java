package com.kainat.learnspringbootfastwebservices.services;

import com.kainat.learnspringbootfastwebservices.entities.Module;
import com.kainat.learnspringbootfastwebservices.repositories.ModuleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultModuleService implements ModuleService {
    private final ModuleRepository moduleRepository;

    @Autowired
    public DefaultModuleService(ModuleRepository moduleRepository) {
        this.moduleRepository = moduleRepository;
    }

    @Override
    public List<Module> getAllModulesWithTheirTutorials() {
        return this.moduleRepository.getAllWithTutorials();
    }
}
