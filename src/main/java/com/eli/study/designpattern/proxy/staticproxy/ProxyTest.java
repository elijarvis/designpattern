package com.eli.study.designpattern.proxy.staticproxy;

/**
 * @author eli
 * @description 测试
 */
public class ProxyTest {
    public static void main(String[] args) {
        // 聚合式静态代理测试
        RealSubject realSubject = new RealSubject();
        Subject subject = new AggregateSubjectProxy(realSubject);
        subject.sayHello();
        System.out.println();
        // 继承式静态代理测试
        InheritSubjectProxy inheritSubjectProxy = new InheritSubjectProxy();
        inheritSubjectProxy.sayHello();
    }
}
