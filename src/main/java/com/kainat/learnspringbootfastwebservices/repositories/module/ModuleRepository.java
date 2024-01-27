package com.kainat.learnspringbootfastwebservices.repositories.module;

import com.kainat.learnspringbootfastwebservices.entities.module.Module;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ModuleRepository extends JpaRepository<Module, Integer> {
    List<Module> getAll();
}
