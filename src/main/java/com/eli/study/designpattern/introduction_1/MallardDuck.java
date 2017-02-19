package com.eli.study.designpattern.introduction_1;

/**
 * @author eli
 * @description:绿头鸭
 */
public class MallardDuck extends Duck{
    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    @Override
    public void display() {
        System.out.println("I'm a mallard duck.");
    }
}
