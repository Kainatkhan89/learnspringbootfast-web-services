package com.kainat.learnspringbootfastwebservices.models.module.styles;

public enum Color {
    INDIGO("INDIGO"),
    TEAL("TEAL"),
    PURPLE("PURPLE"),
    PINK("PINK"),
    YELLOW("YELLOW"),
    FUCHSIA("FUCHSIA"),
    ROSE("ROSE"),
    SKY("SKY");

    private final String color;

    Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
