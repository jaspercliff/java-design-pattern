package com.jasper.example;

public class App {
    public static void main(String[] args) {
        Weather weather = new Weather();
        Orcs orcs = new Orcs();
        Hobbits hobbits = new Hobbits();
        weather.addObserver(orcs);
        weather.addObserver(hobbits);

        weather.timePass();
        weather.timePass();
        weather.timePass();
    }
}
