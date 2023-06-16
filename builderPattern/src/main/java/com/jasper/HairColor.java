package com.jasper;

import lombok.AllArgsConstructor;

/**
 * @author jasper
 * 6/15/2023  7:55 PM
 */
@AllArgsConstructor
public enum HairColor {
    WHITE,
    RED,
    BLUE,
    GREEN,
    ORANGE;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
