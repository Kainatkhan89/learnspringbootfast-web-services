package com.kainat.learnspringbootfastwebservices.dtos.tutorial;

public class TutorialDTO {
    private int id;
    private int number;
    private int module_id;
    private String title;
    private String videoUrl;
    private String starterCodeUrl;
    private String finishedCodeUrl;
    private int durationSeconds;

    public TutorialDTO() {
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

    public int getModule_id() {
        return this.module_id;
    }

    public void setModule_id(int module_id) {
        this.module_id = module_id;
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
