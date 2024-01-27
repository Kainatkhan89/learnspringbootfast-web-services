package com.kainat.learnspringbootfastwebservices.services.module;

import com.kainat.learnspringbootfastwebservices.dtos.module.ModuleDTO;
import com.kainat.learnspringbootfastwebservices.entities.module.Module;

import java.util.List;

public interface ModuleService {
    List<ModuleDTO> getAllModules();
    List<Module> getAllModulesNoDTO();
}
