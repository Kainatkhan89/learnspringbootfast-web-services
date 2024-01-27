package com.kainat.learnspringbootfastwebservices.dtos.module;

import com.kainat.learnspringbootfastwebservices.enums.styles.Color;
import com.kainat.learnspringbootfastwebservices.enums.styles.Icon;

public class ModuleStyle {
    private Color color;
    private Icon icon;

    public Color getColor() {
        return this.color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Icon getIcon() {
        return this.icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }
}
