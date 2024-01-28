package com.kainat.learnspringbootfastwebservices.services.module;

import com.kainat.learnspringbootfastwebservices.dtos.module.ModuleDTO;
import com.kainat.learnspringbootfastwebservices.entities.module.Module;
import com.kainat.learnspringbootfastwebservices.mappers.module.ModuleMapper;
import com.kainat.learnspringbootfastwebservices.repositories.module.ModuleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultModuleService implements ModuleService {
    private final ModuleRepository moduleRepository;
    private final ModuleMapper moduleMapper;

    @Autowired
    public DefaultModuleService(ModuleRepository moduleRepository, ModuleMapper moduleMapper) {
        this.moduleRepository = moduleRepository;
        this.moduleMapper = moduleMapper;
    }

    @Override
    public List<ModuleDTO> getAllModules() {
        List<Module> modules = this.moduleRepository.findAll();

        return this.moduleMapper.toModuleDTOs(modules);
    }

    @Override
    public List<Module> getAllModulesNoDTO() {
        return this.moduleRepository.findAll();
    }
}
