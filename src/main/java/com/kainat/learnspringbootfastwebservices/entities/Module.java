package com.kainat.learnspringbootfastwebservices.entities;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "modules")
public class Module {
    @Id
    @Column(name = "module_id")
    private Integer id;

    @Column(name = "number")
    private Integer number;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @OneToMany()
    @JoinColumn(name = "module_id")
    private Set<Tutorial> tutorials = new HashSet<>();

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "style_code")
    private ModuleStyleCode styleCode;

    public Module() {
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumber() {
        return this.number;
    }

    public void setNumber(Integer number) {
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

    public void setStyleCode(ModuleStyleCode styleCode) {
        this.styleCode = styleCode;
    }

    public Set<Tutorial> getTutorials() {
        return this.tutorials;
    }

    public void setTutorials(Set<Tutorial> tutorials) {
        this.tutorials = tutorials;
    }
}
