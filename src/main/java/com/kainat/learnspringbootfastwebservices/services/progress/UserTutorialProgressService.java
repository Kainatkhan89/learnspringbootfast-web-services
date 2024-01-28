package com.kainat.learnspringbootfastwebservices.services.progress;

import com.kainat.learnspringbootfastwebservices.dtos.progress.CompletedTutorialDTO;
import com.kainat.learnspringbootfastwebservices.dtos.progress.ProgressUpdateRequest;
import com.kainat.learnspringbootfastwebservices.entities.progress.UserTutorialProgress;

import java.util.List;

public interface UserTutorialProgressService {
    UserTutorialProgress markTutorialAsCompleted(ProgressUpdateRequest progressUpdateRequest);
    List<CompletedTutorialDTO> getCompletedTutorialsByUser(String userId);
}
