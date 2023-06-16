package com.jasper;

/**
 * @author jasper
 * 6/15/2023  8:45 PM
 */
public class App {
    public static void main(String[] args) {
        Hero jasper = new Hero.Builder(Profession.MAGE, "jasper").
                withArmor(Armor.LEATHER).
                withHairColor(HairColor.ORANGE).
                withWeapon(Weapon.SWORD).build();
        System.out.println(jasper);
        Hero cliff = new Hero.Builder(Profession.PRIEST, "cliff")
                .withWeapon(Weapon.BOW).
                withHairType(HairType.CURLY).
                withHairColor(HairColor.GREEN).build();
        System.out.println(cliff);
    }
}
