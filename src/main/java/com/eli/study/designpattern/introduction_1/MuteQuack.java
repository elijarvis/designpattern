package com.eli.study.designpattern.introduction_1;

/**
 * @author eli
 * @description: 哑叫
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<<Silence>>");
    }
}
