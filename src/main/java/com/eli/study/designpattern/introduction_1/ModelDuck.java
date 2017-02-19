package com.eli.study.designpattern.introduction_1;

/**
 * @author eli
 * @description: 模型鸭
 */
public class ModelDuck extends Duck {
    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }
    @Override
    public void display() {
        System.out.println("I'm a model duck.");
    }
}
