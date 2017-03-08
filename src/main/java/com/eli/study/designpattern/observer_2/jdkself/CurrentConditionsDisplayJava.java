package com.eli.study.designpattern.observer_2.jdkself;

import com.eli.study.designpattern.observer_2.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * @author eli
 * @description
 */
public class CurrentConditionsDisplayJava implements Observer,DisplayElement {
    private float temperature;
    private float humidity;
    private Observable observable;
    public CurrentConditionsDisplayJava(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature
                + "F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherDataJava){
            WeatherDataJava weatherDataJava = (WeatherDataJava) o;
            this.temperature = weatherDataJava.getTemperature();
            this.humidity = weatherDataJava.getHumidity();
            display();
        }
    }
}
