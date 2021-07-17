package com.design.proxy;

import com.design.proxy.entity.ITarget;
import com.design.proxy.entity.Target;
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
        CombinedStaticProxy proxy = new CombinedStaticProxy(new Target());
        proxy.actionA();
        proxy.actionB();
    }

    /**
     * 测试静态代理--通过继承实现
     */
    @Test
    public void testExtendStaticProxy() {
        ExtendStaticProxy proxy = new ExtendStaticProxy();
        proxy.actionA();
        proxy.actionB();
    }

    /**
     * 测试动态代理
     */
    @Test
    public void testDynamicProxy() {
        ITarget target = new Target();
        DynamicProxy handler = new DynamicProxy(target);
        ITarget proxy = (ITarget) Proxy.newProxyInstance(
                target.getClass().getClassLoader(), target.getClass().getInterfaces(), handler);
        proxy.actionA();
        proxy.actionB();
    }
}
