package com.jasper.example;

import java.util.ArrayList;
import java.util.List;

public class Weather {
    private WeatherType currentWeather;

    private final List<WeatherObserver> observers;

    public Weather(){
        observers = new ArrayList<>();
        currentWeather = WeatherType.SUNNY;
    }


    public void addObserver(WeatherObserver observer){
        observers.add(observer);
    }

    public void removeObserver(WeatherObserver observer){
        observers.remove(observer);
    }

    public void timePass(){
        WeatherType[] values = WeatherType.values();
        currentWeather = values[(currentWeather.ordinal()+1)%values.length];
        notifyAllObserver();
    }

    public void notifyAllObserver(){
        observers.forEach(
                observer ->
                        observer.update(currentWeather)
        );
    }
}
