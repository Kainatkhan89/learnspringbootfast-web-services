package com.kainat.learnspringbootfastwebservices.dtos.user;

public class SaveUserRequest {
    private String userId;
    private String email;

    public SaveUserRequest() {
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String firebaseId) {
        this.userId = firebaseId;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
