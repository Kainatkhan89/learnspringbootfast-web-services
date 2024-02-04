package com.kainat.learnspringbootfastwebservices.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "user_tutorial_progresses")
public class CompletedTutorial {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "user_id")
    private String userId;

    @Column(name = "tutorial_id")
    private Integer completedTutorialId;

    public CompletedTutorial() {
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
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
