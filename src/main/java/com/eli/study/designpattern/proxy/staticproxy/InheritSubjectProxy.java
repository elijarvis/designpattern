package com.eli.study.designpattern.proxy.staticproxy;

/**
 * @author eli
 * @description 继承式静态代理对象
 */
public class InheritSubjectProxy extends RealSubject {

    @Override
    public void sayHello() {
        System.out.println("------before------");
        super.sayHello();
        System.out.println("------after------");
    }
}
