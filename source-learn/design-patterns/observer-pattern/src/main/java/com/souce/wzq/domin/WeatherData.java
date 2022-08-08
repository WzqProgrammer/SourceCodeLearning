package com.souce.wzq.domin;

import com.souce.wzq.interf.Observer;
import com.souce.wzq.interf.Subject;

import java.util.ArrayList;

public class WeatherData implements Subject {

    private float temperature;
    // 湿度
    private float humidity;
    // 气压
    private float pressure;

    private ArrayList<Observer> observers;

    public WeatherData(){
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer O) {
        observers.add(O);
    }

    @Override
    public void removeObserver(Observer O) {
        int idx = observers.indexOf(O);
        if(idx >= 0){
            observers.remove(idx);
        }
    }

    @Override
    public void notifyObservers() {
        for(int i=0; i<observers.size(); i++){
            observers.get(i).update(temperature, humidity, pressure);
        }
    }

    public void setData(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    void measurementsChanged(){
        notifyObservers();
    }
}
