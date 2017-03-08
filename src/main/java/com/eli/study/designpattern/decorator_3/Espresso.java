package com.eli.study.designpattern.decorator_3;

/**
 * @author eli
 * @description: 浓缩咖啡
 */
public class Espresso extends Beverage {
    public Espresso(){
        description = "Espresso";
    }
    @Override
    public double cost() {
        return 1.99;
    }
}
