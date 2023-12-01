package com.jasper.example;

import jdk.nashorn.internal.objects.annotations.Getter;

public enum WeatherType {
    SUNNY("sunny"),
    RAINY("rainy"),
    windy("windy");

    private final String description;

    WeatherType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }

    @Override
    public String toString() {
        return this.name().toLowerCase();
    }
}
