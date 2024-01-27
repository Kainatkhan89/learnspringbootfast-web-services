package com.kainat.learnspringbootfastwebservices.dtos.module;

public class ModuleDTO {
    private int id;
    private int number;
    private String title;
    private String description;
    private ModuleStyle moduleStyle;

    public ModuleDTO(int id, int number, String title, String description, ModuleStyle moduleStyle) {
        this.id = id;
        this.number = number;
        this.title = title;
        this.description = description;
        this.moduleStyle = moduleStyle;
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

    public ModuleStyle getModuleStyle() {
        return this.moduleStyle;
    }

    public void setModuleStyle(ModuleStyle moduleStyle) {
        this.moduleStyle = moduleStyle;
    }
}
