package com.kainat.learnspringbootfastwebservices.dtos.module;

import com.kainat.learnspringbootfastwebservices.entities.tutorial.Tutorial;

import java.util.List;

public class ModuleDTO {
    private int id;
    private int number;
    private String title;
    private String description;
    private ModuleStyle style;
    private List<Tutorial> tutorials;

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

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ModuleStyle getStyle() {
        return this.style;
    }

    public void setStyle(ModuleStyle style) {
        this.style = style;
    }

    public List<Tutorial> getTutorials() {
        return this.tutorials;
    }

    public void setTutorials(List<Tutorial> tutorials) {
        this.tutorials = tutorials;
    }
}
