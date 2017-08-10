package com.eli.study.designpattern.proxy.staticproxy;

/**
 * @author eli
 * @description 真实对象
 */
public class RealSubject implements Subject {
    @Override
    public void sayHello() {
        System.out.println("------hello world------");
    }
}
