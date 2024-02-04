package com.kainat.learnspringbootfastwebservices.repositories;

import com.kainat.learnspringbootfastwebservices.entities.Module;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ModuleRepository extends JpaRepository<Module, Integer> {
    @Query("SELECT m FROM Module m LEFT JOIN FETCH m.tutorials")
    List<Module> getAllWithTutorials();
}
