package com.jasper;

/**
 * @author jasper
 * 6/15/2023  8:26 PM
 */
public enum Weapon {
    DAGGER,// 匕首 短剑
    SWORD,
    AXE,
    WARHAMMER,
    BOW;

    @Override
    public String toString() {
      return name().toLowerCase();
    }
}
