package com.eli.study.designpattern.introduction_1;

/**
 * @author eli
 * @description: 利用火箭动力的飞行行为
 */
public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
