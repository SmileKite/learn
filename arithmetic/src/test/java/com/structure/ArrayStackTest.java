package com.structure;

import org.junit.Test;

import java.awt.*;

/**
 * 基于数组实现的栈测试类
 * @author lizhenyu
 * @date 2021/7/11
 */
public class ArrayStackTest {

    /**
     * 测试数组扩容的情况
     */
    @Test
    public void testDilatation() {
        ArrayStack<String> stack = new ArrayStack<String>(4);
        stack.push("1");
        stack.push("2");
        stack.push("3");
        stack.push("4");
        stack.push("5");
        System.out.println("栈大小为："+stack.size());
        System.out.println("栈数据为："+stack.toString());
    }

    /**
     * 测试出栈、入栈
     */
    @Test
    public void testPushAndPop() {
        ArrayStack<Color> stack = new ArrayStack<Color>(4);
        stack.push(Color.RED);
        stack.push(Color.BLUE);
        stack.push(Color.GREEN);
        stack.push(Color.GRAY);
        System.out.println("栈数据为："+stack.toString());
        System.out.println("元素"+stack.pop()+"出栈");
        System.out.println("栈数据为："+stack.toString());
    }
}
