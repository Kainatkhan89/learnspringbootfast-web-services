package com.kainat.learnspringbootfastwebservices.repositories;

import com.kainat.learnspringbootfastwebservices.entities.Module;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ModuleRepository extends JpaRepository<Module, Integer> {
    @Query("SELECT m FROM Module m LEFT JOIN FETCH m.tutorials")
    List<Module> getAllWithTutorials();
}
