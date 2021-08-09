package com.leetcode;

import org.junit.Test;

/**
 * @author lizhenyu
 * @date 2021/8/9
 */
public class LeetCode0020Test {

    /**
     * 测试基数情况
     */
    @Test
    public void testInvalidLen() {
        LeetCode0020 leetCode0020 = new LeetCode0020();
        System.out.println(leetCode0020.isValid("([)"));
    }

    /**
     * 测试无效的括号
     */
    @Test
    public void testInvalidStr() {
        LeetCode0020 leetCode0020 = new LeetCode0020();
        System.out.println(leetCode0020.isValid("([)]"));
    }

    /**
     * 测试结尾为左括号的情况
     */
    @Test
    public void testEndWithLeft() {
        LeetCode0020 leetCode0020 = new LeetCode0020();
        System.out.println(leetCode0020.isValid("()(("));
    }

    /**
     * 测试开头为右括号的情况
     */
    @Test
    public void testStartWithRight() {
        LeetCode0020 leetCode0020 = new LeetCode0020();
        System.out.println(leetCode0020.isValid(")("));
    }

    /**
     * 测试有效的括号
     */
    @Test
    public void testValidStr() {
        LeetCode0020 leetCode0020 = new LeetCode0020();
        System.out.println(leetCode0020.isValid("()[{}]"));
    }
}
