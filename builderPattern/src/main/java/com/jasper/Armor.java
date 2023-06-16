package com.jasper;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

/**
 * @author jasper
 * 6/15/2023  7:50 PM
 */
@AllArgsConstructor
public enum Armor {
     CLOTHES("clothes"),
    LEATHER("leather"),
     CHAIN_MAIL("chain_mail"),
    PLATE_MAIL("plate_mail");
    private final String title;

    @Override
    public String toString() {
       return title;
    }
}
