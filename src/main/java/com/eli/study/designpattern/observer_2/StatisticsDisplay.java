package com.eli.study.designpattern.observer_2;

/**
 * @author eli
 * @description
 */
public class StatisticsDisplay implements Observer,DisplayElement {
    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;
    public StatisticsDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("StatisticsDisplay: " + temperature
                + "F degrees and " + humidity + "% humidity");
    }
}
