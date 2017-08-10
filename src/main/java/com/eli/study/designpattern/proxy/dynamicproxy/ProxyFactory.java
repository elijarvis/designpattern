package com.eli.study.designpattern.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author eli
 * @description
 */
public class ProxyFactory {
    private Object realObject;//真实对象

    public ProxyFactory(Object realObject) {
        this.realObject = realObject;
    }

    /**
     * 给真实对象生成代理对象
     * @return
     */
    public Object getProxyInstance(){
        return Proxy.newProxyInstance(realObject.getClass().getClassLoader(),
                realObject.getClass().getInterfaces(),
                new InvocationHandler() {
                    /**
                     *
                     * @param proxy 真实对象
                     * @param method 真实对象的方法
                     * @param args 真实对象方法的参数
                     * @return
                     * @throws Throwable
                     */
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("------before------");
                        Object proxyObject = method.invoke(realObject,args);
                        System.out.println("------after------");
                        return proxyObject;
                    }
                });
    }
}
