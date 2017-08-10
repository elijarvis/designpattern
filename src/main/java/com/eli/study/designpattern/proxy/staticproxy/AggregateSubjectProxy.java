package com.eli.study.designpattern.proxy.staticproxy;

/**
 * @author eli
 * @description 聚合式静态代理对象
 */
public class AggregateSubjectProxy implements Subject{
    private RealSubject realSubject;

    public AggregateSubjectProxy(RealSubject realSubject) {
        this.realSubject = realSubject;
    }
    @Override
    public void sayHello() {
        System.out.println("------before------");
        realSubject.sayHello();
        System.out.println("------after------");
    }
}
