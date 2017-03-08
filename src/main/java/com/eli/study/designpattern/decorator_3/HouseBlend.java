package com.eli.study.designpattern.decorator_3;

/**
 * @author eli
 * @description: 浓缩咖啡
 */
public class HouseBlend extends Beverage {
    public HouseBlend(){
        description = "House Blend Coffee";
    }
    @Override
    public double cost() {
        return 0.89;
    }
}
