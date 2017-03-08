package com.eli.study.designpattern.decorator_3;

/**
 * @author eli
 * @description 饮料抽象类
 */
public abstract class Beverage {
    String description = "Unknown Beverage";

    /**
     * 子类必须实现
     * @return
     */
    public String getDescription(){
        return description;
    }
    public abstract double cost();
}
