package com.eli.study.designpattern.proxy.dynamicproxy;

import com.eli.study.designpattern.proxy.staticproxy.RealSubject;
import com.eli.study.designpattern.proxy.staticproxy.Subject;

/**
 * @author eli
 * @description
 */
public class JdkDynamicProxyTest {
    public static void main(String[] args) {
        Subject realSubject = new RealSubject();//真实对象
        Subject proxySubject = (Subject) new ProxyFactory(realSubject).getProxyInstance();//创建代理对象
        proxySubject.sayHello();//执行方法
    }
}
