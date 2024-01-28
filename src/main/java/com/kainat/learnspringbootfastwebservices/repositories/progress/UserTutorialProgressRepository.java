package com.kainat.learnspringbootfastwebservices.repositories.progress;

import com.kainat.learnspringbootfastwebservices.entities.progress.UserTutorialProgress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserTutorialProgressRepository extends JpaRepository<UserTutorialProgress, Long> {
}
