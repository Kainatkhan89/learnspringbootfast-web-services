package com.kainat.learnspringbootfastwebservices.repositories.module;

import com.kainat.learnspringbootfastwebservices.entities.module.Module;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ModuleRepository extends JpaRepository<Module, Integer> {
}
