package com.kainat.learnspringbootfastwebservices.services.module;

import com.kainat.learnspringbootfastwebservices.dtos.module.ModuleDTO;

import java.util.List;

public interface ModuleService {
    List<ModuleDTO> getAllModules();
}
