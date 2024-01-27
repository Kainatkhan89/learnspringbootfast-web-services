package com.kainat.learnspringbootfastwebservices.models.module.styles;

public enum ColorCode {
    INDIGO("INDIGO"),
    TEAL("TEAL"),
    PURPLE("PURPLE"),
    PINK("PINK"),
    YELLOW("YELLOW"),
    FUCHSIA("FUCHSIA"),
    ROSE("ROSE"),
    SKY("SKY");

    private final String color;

    ColorCode(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
