package com.design.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理实现
 * @author lizhenyu
 * @date 2021/6/24
 */
public class DynamicProxy implements InvocationHandler {
    /** 被代理对象 */
    private Object proxyObject;
    public DynamicProxy(Object proxyObject) {
        this.proxyObject = proxyObject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("执行代理类方法前的逻辑");
        Object invoke = method.invoke(proxyObject, args);
        System.out.println("执行代理类方法后的逻辑");
        return invoke;
    }
}
