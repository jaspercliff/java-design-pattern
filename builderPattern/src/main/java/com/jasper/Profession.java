package com.jasper;

/**
 * @author jasper
 * 6/15/2023  8:18 PM
 */
public enum Profession {
    WARRIOR,//战士
    THIEF,
    MAGE,
    PRIEST;//牧师

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
