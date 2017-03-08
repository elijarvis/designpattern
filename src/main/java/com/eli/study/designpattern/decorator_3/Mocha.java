package com.eli.study.designpattern.decorator_3;

/**
 * @author eli
 * @description: 摩卡
 */
public class Mocha extends CondimentDecorator {
    //用一个实例变量记录饮料（被装饰者）
    Beverage beverage;
    public Mocha(Beverage beverage){
        //把被装饰者记录到实例变量中
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription()+",Mocha";
    }

    @Override
    public double cost() {
        return 0.20+beverage.cost();
    }
}
