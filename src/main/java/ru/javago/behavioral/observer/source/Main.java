package ru.javago.behavioral.observer.source;

import ru.javago.behavioral.observer.source.realization.CurrentConditionsDisplay;
import ru.javago.behavioral.observer.source.realization.WeatherData;

public class Main {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(29f, 65f, 745);
        weatherData.setMeasurements(39f, 70f, 760);
        weatherData.setMeasurements(42f, 72f, 763);
    }
}
