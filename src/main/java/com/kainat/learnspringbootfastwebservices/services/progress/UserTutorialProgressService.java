package com.kainat.learnspringbootfastwebservices.services.progress;

import com.kainat.learnspringbootfastwebservices.entities.progress.UserTutorialProgress;

public interface UserTutorialProgressService {
    UserTutorialProgress markTutorialAsCompleted();
}
