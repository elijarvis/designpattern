package com.eli.study.designpattern.proxy.dynamicproxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author eli
 * @description MethodInterceptor为方法拦截器接口
 */
public class CglibDynamicProxy implements MethodInterceptor{
    private Object target;
    public Object getInstance(Object target){
        this.target = target;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(this.target.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("------before------");
        methodProxy.invokeSuper(o,objects);
        System.out.println("------after------");
        return null;
    }
}
