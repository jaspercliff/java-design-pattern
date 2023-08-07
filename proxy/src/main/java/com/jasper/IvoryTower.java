package com.jasper;

public class IvoryTower implements WizardTower{
    @Override
    public void enter(Wizard wizard) {
        System.out.println(wizard+"enter the tower");
    }
}
