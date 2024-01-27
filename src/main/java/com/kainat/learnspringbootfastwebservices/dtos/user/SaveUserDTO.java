package com.kainat.learnspringbootfastwebservices.dtos.user;

public class SaveUserDTO {
    private String firebaseId;
    private String email;

    public SaveUserDTO() {
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
