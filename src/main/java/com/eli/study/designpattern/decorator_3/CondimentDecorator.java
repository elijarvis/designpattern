package com.eli.study.designpattern.decorator_3;

/**
 * @author eli
 * @description 调料装饰者抽象类
 */
public abstract class CondimentDecorator extends Beverage{
    /**
     * 所有调料装饰者都必须重新实现该方法
     * @return
     */
    public abstract String getDescription();
}
