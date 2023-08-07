package com.jasper;

import lombok.Data;

@Data
public class WizardTowerProxy implements WizardTower{
    private static final Integer MAX_ALLOWED_NUM = 3;
    private Integer numWizards = 0;
    private final WizardTower tower;

    @Override
    public void enter(Wizard wizard) {
            if(numWizards<MAX_ALLOWED_NUM){
                tower.enter(wizard);
                numWizards++;
            }else {
                System.out.println("is max");
            }
    }
}
