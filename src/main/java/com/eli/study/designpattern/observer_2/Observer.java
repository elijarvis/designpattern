package com.eli.study.designpattern.observer_2;

/**
 * @author eli
 * @description 观察者接口
 */
public interface Observer {
    void update(float temp,float humidity,float pressure);
}
