package com.kainat.learnspringbootfastwebservices.dtos.progress;

public class ProgressUpdateRequest {
    private String userId;
    private int completedTutorialId;

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getCompletedTutorialId() {
        return this.completedTutorialId;
    }

    public void setCompletedTutorialId(int completedTutorialId) {
        this.completedTutorialId = completedTutorialId;
    }
}
