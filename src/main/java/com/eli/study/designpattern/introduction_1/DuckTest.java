package com.eli.study.designpattern.introduction_1;

/**
 * @author eli
 * @description:
 */
public class DuckTest {
    public static void main(String[] args){
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        Duck model = new ModelDuck();
        model.performFly();//不会飞
        model.setFlyBehavior(new FlyRocketPowered());//动态改变模型鸭的飞行能力
        model.performFly();//火箭动力飞行

    }
}
