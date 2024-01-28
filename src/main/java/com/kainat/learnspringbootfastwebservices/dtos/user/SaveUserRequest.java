package com.kainat.learnspringbootfastwebservices.dtos.user;

public class SaveUserRequest {
    private String firebaseId;
    private String email;

    public SaveUserRequest() {
    }

    public String getFirebaseId() {
        return this.firebaseId;
    }

    public void setFirebaseId(String firebaseId) {
        this.firebaseId = firebaseId;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
