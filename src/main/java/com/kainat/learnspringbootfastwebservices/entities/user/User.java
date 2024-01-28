package com.kainat.learnspringbootfastwebservices.entities.user;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {

    @Id
    @Column(name = "user_id")
    private String id;

    @Column(name = "email")
    private String email;

    public User() {
    }

    public String getId() {
        return this.id;
    }

    public void setId(String firebaseId) {
        this.id = firebaseId;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
