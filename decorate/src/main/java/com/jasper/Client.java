package com.jasper;

/**
 * Hello world!
 *
 */
public class Client
{
    public static void main( String[] args )
    {
        SimpleCoffee simpleCoffee = new SimpleCoffee();
        MilkDecorate milkDecorate = new MilkDecorate(simpleCoffee);
        System.out.println(milkDecorate.cost() + "-" + milkDecorate.getDescription());
    }
}
