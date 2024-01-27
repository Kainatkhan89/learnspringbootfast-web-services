package com.kainat.learnspringbootfastwebservices.models.module.styles;

public enum IconCode {
    BOOK("BOOK"),
    FLAG("FLAG"),
    TERMINAL("TERMINAL"),
    WARNING("WARNING"),
    SHIELD("SHIELD"),
    DATABASE("DATABASE"),
    LOCK("LOCK"),
    PLANE("PLANE");

    private final String icon;

    IconCode(String icon) {
        this.icon = icon;
    }

    public String getIcon() {
        return icon;
    }
}
