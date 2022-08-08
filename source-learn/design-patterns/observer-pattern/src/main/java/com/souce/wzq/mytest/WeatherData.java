package com.souce.wzq.mytest;

import java.util.Observable;

public class WeatherData extends Observable {

    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){}

    public void measurementsChanged(){
        // 在调用notifyObservers之前，需要来指示转态已经变更
        setChanged();
        notifyObservers();
    }

    public void setData(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    // Observer需要拉取自己需要的数据
    public float getTemperature() {
        return temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }
}
