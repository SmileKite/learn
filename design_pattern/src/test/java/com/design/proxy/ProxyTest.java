package com.design.proxy;

import org.junit.Test;

import java.lang.reflect.Proxy;

/**
 * 代理模式测试
 * @author lizhenyu
 * @date 2021/6/24
 */
public class ProxyTest {

    /**
     * 测试静态代理--通过组合实现
     */
    @Test
    public void testCombinedStaticProxy() {
        CombinedStaticProxyDemo.IStaticProxy proxy =
                new CombinedStaticProxyDemo.StaticProxy(new CombinedStaticProxyDemo.StaticProxyImpl());
        proxy.a();
        proxy.b();
    }

    /**
     * 测试静态代理--通过继承实现
     */
    @Test
    public void testExtendStaticProxy() {
        ExtendStaticProxyDemo.Static proxy = new ExtendStaticProxyDemo.StaticProxy();
        proxy.a();
        proxy.b();
    }

    /**
     * 测试动态代理
     */
    @Test
    public void testDynamicProxy() {
        DynamicProxyDemo.IDynamicProxy real = new DynamicProxyDemo.DynamicProxy();
        DynamicProxyDemo.DynamicProxyHandler handler = new DynamicProxyDemo.DynamicProxyHandler(real);
        DynamicProxyDemo.IDynamicProxy proxy = (DynamicProxyDemo.IDynamicProxy)
                Proxy.newProxyInstance(real.getClass().getClassLoader(), real.getClass().getInterfaces(), handler);
        proxy.deal();
    }
}
