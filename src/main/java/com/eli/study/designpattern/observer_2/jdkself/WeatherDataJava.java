package com.eli.study.designpattern.observer_2.jdkself;

import java.util.Observable;

/**
 * @author eli
 * @description
 */
public class WeatherDataJava extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;
    public WeatherDataJava(){

    }
    public void measurementsChanged(){
        setChanged();
        notifyObservers();
    }
    public void setMeasurements(float temperature,float humidity,float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
