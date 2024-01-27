package com.kainat.learnspringbootfastwebservices.models.entities.module;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "module_style_codes")
public class ModuleStyleCode {

    @Id
    @Column(name = "style_code")
    private int styleCode;

    @Column(name = "color")
    private String color;

    @Column(name ="icon")
    private String icon;

    public ModuleStyleCode() {}

    public int getStyleCode() {
        return this.styleCode;
    }

    public void setStyleCode(int styleCode) {
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
