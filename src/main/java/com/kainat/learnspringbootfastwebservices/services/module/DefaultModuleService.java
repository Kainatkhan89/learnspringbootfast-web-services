package com.kainat.learnspringbootfastwebservices.services.module;

import com.kainat.learnspringbootfastwebservices.dtos.module.ModuleDTO;
import com.kainat.learnspringbootfastwebservices.entities.module.Module;
import com.kainat.learnspringbootfastwebservices.mappers.ModuleMapper;
import com.kainat.learnspringbootfastwebservices.repositories.module.ModuleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultModuleService implements ModuleService {
    private final ModuleRepository moduleRepository;

    public DefaultModuleService(ModuleRepository moduleRepository) {
        this.moduleRepository = moduleRepository;
    }

    @Override
    public List<ModuleDTO> getAllModules() {
        List<Module> modules = this.moduleRepository.findAll();

        return ModuleMapper.toDTOList(modules);
    }

    @Override
    public List<Module> getAllModulesNoDTO() {
        return this.moduleRepository.findAll();
    }
}
