package com.kainat.learnspringbootfastwebservices.dtos;

public class UpdateLearningProgressRequest {
    private String userId;
    private Integer completedTutorialId;

    public UpdateLearningProgressRequest() {
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getCompletedTutorialId() {
        return this.completedTutorialId;
    }

    public void setCompletedTutorialId(Integer completedTutorialId) {
        this.completedTutorialId = completedTutorialId;
    }
}
