package com.jasper;

public class SimpleCoffee implements Coffee{
    @Override
    public double cost() {
        return 2.0;
    }

    @Override
    public String getDescription() {
        return "simpleCoffee";
    }
}
