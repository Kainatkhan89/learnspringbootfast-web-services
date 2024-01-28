package com.kainat.learnspringbootfastwebservices.entities.user;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.kainat.learnspringbootfastwebservices.entities.progress.UserTutorialProgress;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "users")
public class User {

    @Id
    @Column(name = "user_id")
    private String id;

    @Column(name = "email")
    private String email;

    @OneToMany(mappedBy = "user")
    @JsonManagedReference
    private List<UserTutorialProgress> userCompletedTutorials;

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

    public List<UserTutorialProgress> getUserCompletedTutorials() {
        return this.userCompletedTutorials;
    }

    public void setUserCompletedTutorials(List<UserTutorialProgress> userCompletedTutorials) {
        this.userCompletedTutorials = userCompletedTutorials;
    }
}
