package com.eli.study.designpattern.introduction_1;

/**
 * @author eli
 * @description:鸭子超类
 */
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    public Duck(){}
    public abstract void display();
    public void performFly(){
        flyBehavior.fly();
    }
    public void performQuack(){
        quackBehavior.quack();
    }
    /**
    * @description:  动态改变鸭子的行为
    * @author eli
    */
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
    /**
     * @description:  动态改变鸭子的行为
     * @author eli
     */
    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void swim(){
        System.out.println("All ducks float,even decoys!");
    }
}
