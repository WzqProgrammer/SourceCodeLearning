package com.souce.wzq;


import com.souce.wzq.mytest.CurrentConditionDisplay;
import com.souce.wzq.mytest.WeatherData;

public class WeaterSample {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        weatherData.setData(35.f, 65.4f, 98f);
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);

        currentConditionDisplay.update(weatherData, "");

    }
}
