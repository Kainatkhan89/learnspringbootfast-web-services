package com.kainat.learnspringbootfastwebservices.persistence.entities.module;

import jakarta.persistence.*;

@Entity
@Table(name = "modules")
public class Module {

    @Id
    @Column(name = "module_id")
    private int id;

    @Column(name = "number")
    private int number;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "style_code")
    private ModuleStyleCode moduleStyleCode;

    public Module() {
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

    public ModuleStyleCode getModuleStyleCode() {
        return this.moduleStyleCode;
    }

    public void setModuleStyleCode(ModuleStyleCode moduleStyleCode) {
        this.moduleStyleCode = moduleStyleCode;
    }
}
