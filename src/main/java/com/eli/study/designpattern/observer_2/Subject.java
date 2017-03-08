package com.eli.study.designpattern.observer_2;

/**
 * @author eli
 * @description 主题接口
 */
public interface Subject {
    /**
     * 观察者注册
     * @param o
     */
    void registerObserver(Observer o);

    /**
     * 移除观察者
     * @param o
     */
    void removeObserver(Observer o);

    /**
     * 主题状态改变时，通知观察者
     */
    void notifyObservers();
}
