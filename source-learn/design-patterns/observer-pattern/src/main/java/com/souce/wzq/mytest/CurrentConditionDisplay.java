package com.souce.wzq.mytest;

import com.souce.wzq.interf.DisplayElement;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;

    Observable observable;

    public CurrentConditionDisplay(Observable observable){
        this.observable = observable;
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData){
            WeatherData weatherData = (WeatherData)o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Current condition: " + temperature + "F degrees and " + humidity + "% humidity");
    }
}
