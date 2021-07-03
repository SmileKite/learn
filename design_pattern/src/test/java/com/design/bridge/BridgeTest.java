package com.design.bridge;

import org.junit.Test;

/**
 * 桥接模式测试
 * @author lizhenyu
 * @date 2021/6/27
 */
public class BridgeTest {

    /**
     * 测试桥接模式
     */
    @Test
    public void testBridge() {
        // 实现角色1
        BridgeDemo.Implementor implementor1 = new BridgeDemo.Implementor1();
        // 抽象角色1
        BridgeDemo.Abstraction abstraction1 = new BridgeDemo.Abstract1(implementor1);
        abstraction1.deal();
        // 实现角色2
        BridgeDemo.Implementor implementor2 = new BridgeDemo.Implementor2();
        // 抽象角色2
        BridgeDemo.Abstraction abstraction2 = new BridgeDemo.Abstract2(implementor2);
        abstraction2.deal();
    }
}
