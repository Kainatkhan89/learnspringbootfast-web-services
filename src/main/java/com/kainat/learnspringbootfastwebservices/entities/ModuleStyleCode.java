package com.kainat.learnspringbootfastwebservices.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "module_style_codes")
public class ModuleStyleCode {
    @Id
    @Column(name = "style_code")
    private Integer styleCode;

    @Column(name = "color")
    private String color;

    @Column(name = "icon")
    private String icon;

    public ModuleStyleCode() {
    }

    public Integer getStyleCode() {
        return this.styleCode;
    }

    public void setStyleCode(Integer styleCode) {
        this.styleCode = styleCode;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getIcon() {
        return this.icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}
