package com.kainat.learnspringbootfastwebservices.repositories;

import com.kainat.learnspringbootfastwebservices.entities.CompletedTutorial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LearningProgressRepository extends JpaRepository<CompletedTutorial, Integer> {
    @Query("SELECT ct.completedTutorialId FROM CompletedTutorial ct WHERE ct.userId = :userId")
    public List<Integer> findCompletedTutorialIdsByUserId(@Param("userId") String userId);
}
