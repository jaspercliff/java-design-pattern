package com.jasper;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        WizardTowerProxy proxy = new WizardTowerProxy(new IvoryTower());
        proxy.enter(new Wizard("jasper"));
        proxy.enter(new Wizard("cliff"));
        proxy.enter(new Wizard("hzq"));
        proxy.enter(new Wizard("mike"));
        proxy.enter(new Wizard("fddasd"));
    }
}
