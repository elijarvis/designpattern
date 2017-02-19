package com.eli.study.designpattern.introduction_1;

/**
 * @author eli
 * @description:吱吱叫
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
