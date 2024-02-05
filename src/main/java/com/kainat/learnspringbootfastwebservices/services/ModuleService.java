package com.kainat.learnspringbootfastwebservices.services;

import com.kainat.learnspringbootfastwebservices.entities.Module;

import java.util.List;

public interface ModuleService {
    List<Module> getAllModulesWithTheirTutorials();
}
