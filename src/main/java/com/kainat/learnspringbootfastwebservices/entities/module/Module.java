package com.kainat.learnspringbootfastwebservices.entities.module;

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

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "style_code")
    private ModuleStyleCode styleCode;

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

    public ModuleStyleCode getStyleCode() {
        return this.styleCode;
    }

    public void setStyleCode(ModuleStyleCode moduleStyleCode) {
        this.styleCode = moduleStyleCode;
    }
}
