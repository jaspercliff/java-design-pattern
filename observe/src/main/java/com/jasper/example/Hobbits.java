package com.jasper.example;

public class Hobbits implements WeatherObserver{
    @Override
    public void update(WeatherType weatherType) {
        System.out.println("the Hobbits are facing " + weatherType.getDescription()+" weather now");
    }
}
