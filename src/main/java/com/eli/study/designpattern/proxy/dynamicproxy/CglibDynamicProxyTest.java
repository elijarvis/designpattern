package com.eli.study.designpattern.proxy.dynamicproxy;

/**
 * @author eli
 * @description
 */
public class CglibDynamicProxyTest {
    public static void main(String[] args) {
        CglibDynamicProxy cglib = new CglibDynamicProxy();
        BusinessObject businessObject = (BusinessObject) cglib.getInstance(new BusinessObject());
        businessObject.doSomething();
    }
}
