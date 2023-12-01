package com.jasper.example;

public class Orcs implements WeatherObserver {

    @Override
    public void update(WeatherType weatherType) {
        System.out.println("the orcs are facing " + weatherType.getDescription()+" weather now");
    }
}
