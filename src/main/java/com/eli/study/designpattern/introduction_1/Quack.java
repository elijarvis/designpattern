package com.eli.study.designpattern.introduction_1;

/**
 * @author eli
 * @description: 嘎嘎叫
 */
public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
