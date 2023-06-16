package com.jasper;

import lombok.AllArgsConstructor;

/**
 * @author jasper
 * 6/15/2023  8:06 PM
 */
@AllArgsConstructor
public enum HairType {
    SHORT("short"),
    CURLY("curly"),
    BOLD("bold"),
    LONG_STRAIGHT("long_straight"),
    LONG_CURLY("long_curly");

    private final String title;

    @Override
    public String toString() {
        return title;
    }
}
