package com.kainat.learnspringbootfastwebservices.entities.tutorial;

import com.kainat.learnspringbootfastwebservices.entities.module.Module;
import jakarta.persistence.*;

@Entity
@Table(name = "tutorials")
public class Tutorial {

    @Id
    @Column(name = "tutorial_id")
    private int id;

    @Column(name = "number")
    private int number;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "module_id", nullable = false)
    private Module module;

    @Column(name = "title")
    private String title;

    @Column(name = "video_url")
    private String videoUrl;

    @Column(name = "starter_code_url")
    private String starterCodeUrl;

    @Column(name = "finished_code_url")
    private String finishedCodeUrl;

    @Column(name = "duration_seconds")
    private int durationSeconds;

    public Tutorial() {
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Module getModule() {
        return this.module;
    }

    public void setModule(Module module) {
        this.module = module;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getVideoUrl() {
        return this.videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getStarterCodeUrl() {
        return this.starterCodeUrl;
    }

    public void setStarterCodeUrl(String starterCodeUrl) {
        this.starterCodeUrl = starterCodeUrl;
    }

    public String getFinishedCodeUrl() {
        return this.finishedCodeUrl;
    }

    public void setFinishedCodeUrl(String finishedCodeUrl) {
        this.finishedCodeUrl = finishedCodeUrl;
    }

    public int getDurationSeconds() {
        return this.durationSeconds;
    }

    public void setDurationSeconds(int durationSeconds) {
        this.durationSeconds = durationSeconds;
    }
}