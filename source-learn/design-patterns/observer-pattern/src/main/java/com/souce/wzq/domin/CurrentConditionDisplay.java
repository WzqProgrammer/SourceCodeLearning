package com.souce.wzq.domin;

import com.souce.wzq.interf.DisplayElement;
import com.souce.wzq.interf.Observer;
import com.souce.wzq.interf.Subject;

/**
 * @author wangzhengqing
 * 当前观测显示布告栏
 */
public class CurrentConditionDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current condition: " + temperature + "F degrees and" + humidity + "% humidity");
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
}
