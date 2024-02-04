package com.kainat.learnspringbootfastwebservices.repositories;

import com.kainat.learnspringbootfastwebservices.entities.Module;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModuleRepository extends JpaRepository<Module, Integer> {
}
