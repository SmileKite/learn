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
        ClassAdapterDemo.ITarget adaptor = new ClassAdapterDemo.Adaptor();
        System.out.println(adaptor.add(1, 3));
        System.out.println(adaptor.subtract(8, 3));
        System.out.println(adaptor.multiply(3, 3));
        System.out.println(adaptor.divide(11, 3));
    }

    /**
     * 测试组合关系的适配器
     */
    @Test
    public void testCombinedAdapter() {
        CombinedAdapterDemo.ITarget adaptor = new CombinedAdapterDemo.Adaptor(new CombinedAdapterDemo.Adaptee());
        System.out.println(adaptor.add(1, 3));
        System.out.println(adaptor.subtract(8, 3));
        System.out.println(adaptor.multiply(3, 3));
        System.out.println(adaptor.divide(11, 3));
    }

}
