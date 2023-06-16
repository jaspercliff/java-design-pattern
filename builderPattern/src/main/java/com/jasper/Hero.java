package com.jasper;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

/**
 * @author jasper
 * 6/15/2023  7:22 PM
 */
@Getter
public class Hero {
    private final String name;
    private final Profession profession;
    private final HairColor hairColor;
    private final HairType hairType;
    private final Armor armor;
    private final Weapon weapon;

    private  Hero(Builder builder){
        this.armor = builder.armor;
        this.name = builder.name;
        this.hairColor = builder.hairColor;
        this.weapon = builder.weapon;
        this.hairType = builder.hairType;
        this.profession = builder.profession;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("This is a ")
                .append(profession)
                .append(" named ")
                .append(name);
        if (hairColor != null || hairType != null) {
            sb.append(" with ");
            if (hairColor != null) {
                sb.append(hairColor).append(' ');
            }
            if (hairType != null) {
                sb.append(hairType).append(' ');
            }
            sb.append(hairType != HairType.BOLD ? "hair" : "head");
        }
        if (armor != null) {
            sb.append(" wearing ").append(armor);
        }
        if (weapon != null) {
            sb.append(" and wielding a ").append(weapon);
        }
        sb.append('.');
        return sb.toString();
    }

    public static class Builder{
        private final Profession profession;
        private final String name;
        private Armor armor;
        private HairType hairType;
        private HairColor hairColor;
        private Weapon weapon;

        public Builder(Profession profession,String name){
            if(profession == null || name == null){
                throw new IllegalArgumentException("参数不正确");
            }
            this.profession = profession;
            this.name = name;
        }

        public Builder withHairType(HairType hairType){
            this.hairType = hairType;
            return this;
        }

        public Builder withHairColor(HairColor hairColor){
            this.hairColor = hairColor;
            return this;
        }

        public Builder withArmor(Armor armor){
            this.armor = armor;
            return this;
        }
        public Builder withWeapon(Weapon weapon){
            this.weapon = weapon;
            return this;
        }

        public Hero build(){
            return new Hero(this);
        }
    }
}

