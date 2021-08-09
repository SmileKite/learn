package com.leetcode;

import org.junit.Test;

/**
 * @author lizhenyu
 * @date 2021/8/9
 */
public class LeetCode0150Test {

    /**
     * 测试逆波兰表达式
     */
    @Test
    public void testCommon() {
        LeetCode0150 leetCode0150 = new LeetCode0150();
        System.out.println(leetCode0150.evalRPN(new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"}));
    }
}
