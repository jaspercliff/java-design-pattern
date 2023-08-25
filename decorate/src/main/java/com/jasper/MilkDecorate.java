package com.jasper;

public class MilkDecorate implements Coffee {
    public MilkDecorate(SimpleCoffee simpleCoffee) {
        this.simpleCoffee = simpleCoffee;
    }

    private SimpleCoffee simpleCoffee;
    @Override
    public double cost() {
        return simpleCoffee.cost()+1.0;
    }

    @Override
    public String getDescription() {
        return simpleCoffee.getDescription()+" with milk";
    }
}
