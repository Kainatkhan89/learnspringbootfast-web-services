package com.kainat.learnspringbootfastwebservices.entities.progress;

import com.kainat.learnspringbootfastwebservices.entities.tutorial.Tutorial;
import com.kainat.learnspringbootfastwebservices.entities.user.User;
import jakarta.persistence.*;

@Entity
@Table(name = "user_tutorial_progresses")
public class UserProgress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "tutorial_id", referencedColumnName = "tutorial_id")
    private Tutorial tutorial;

    public UserProgress() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Tutorial getTutorial() {
        return this.tutorial;
    }

    public void setTutorial(Tutorial tutorial) {
        this.tutorial = tutorial;
    }
}
