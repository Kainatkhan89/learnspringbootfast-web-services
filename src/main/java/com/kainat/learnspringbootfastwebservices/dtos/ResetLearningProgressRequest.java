package com.kainat.learnspringbootfastwebservices.dtos;

public class ResetLearningProgressRequest {
    private String userId;

    public ResetLearningProgressRequest() {
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
