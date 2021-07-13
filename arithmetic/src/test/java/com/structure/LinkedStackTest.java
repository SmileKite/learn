package com.structure;

import org.junit.Test;

/**
 * @author lizhenyu
 * @date 2021/7/12
 */
public class LinkedStackTest {

    @Test
    public void testLinkedStack() {
        LinkedStack<String> stacks = new LinkedStack<>();
        stacks.push("1");
        stacks.push("2");
        stacks.push("3");
        stacks.push("4");
        System.out.println(stacks.toString());
        System.out.println(stacks.pop());
        System.out.println(stacks.pop());
    }
}
