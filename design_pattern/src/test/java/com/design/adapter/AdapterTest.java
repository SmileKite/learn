package com.design.adapter;

import org.junit.Test;

/**
 * 适配器模式测试
 * @author lizhenyu
 * @date 2021/6/26
 */
public class AdapterTest {

    /**
     * 测试继承关系的适配器
     */
    @Test
    public void testClassAdapter() {
        ITarget target = new ClassAdaptor();
        target.actionA();
        target.actionB();
        target.actionC();
    }

    /**
     * 测试组合关系的适配器
     */
    @Test
    public void testCombinedAdapter() {
        ITarget target = new CombinedAdaptor(new Adaptee());
        target.actionA();
        target.actionB();
        target.actionC();
    }

}
