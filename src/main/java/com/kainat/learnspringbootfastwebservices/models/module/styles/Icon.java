package com.kainat.learnspringbootfastwebservices.models.module.styles;

public enum Icon {
    BOOK("BOOK"),
    FLAG("FLAG"),
    TERMINAL("TERMINAL"),
    WARNING("WARNING"),
    SHIELD("SHIELD"),
    DATABASE("DATABASE"),
    LOCK("LOCK"),
    PLANE("PLANE");

    private final String icon;

    Icon(String icon) {
        this.icon = icon;
    }

    public String getIcon() {
        return icon;
    }
}
