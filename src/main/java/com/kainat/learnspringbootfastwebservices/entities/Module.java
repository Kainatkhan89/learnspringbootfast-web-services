package com.kainat.learnspringbootfastwebservices.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

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

    @Column(name = "style_code")
    private Integer styleCode;

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

    public Integer getStyleCode() {
        return this.styleCode;
    }

    public void setStyleCode(Integer styleCode) {
        this.styleCode = styleCode;
    }
}
