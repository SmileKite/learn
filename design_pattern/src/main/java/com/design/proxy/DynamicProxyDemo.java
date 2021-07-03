package com.design.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理实现
 * @author lizhenyu
 * @date 2021/6/24
 */
public class DynamicProxyDemo {

    interface IDynamicProxy {
        void deal();
    }

    static class DynamicProxy implements IDynamicProxy {
        @Override
        public void deal() {
            System.out.println("开始处理逻辑");
            System.out.println("结束处理逻辑");
        }
    }

    static class DynamicProxyHandler implements InvocationHandler {
        /** 被代理对象 */
        private Object proxyObject;
        public DynamicProxyHandler(Object proxyObject) {
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

}
