package com.leetcode;

import org.junit.Test;

/**
 * @author lizhenyu
 * @date 2021/8/9
 */
public class LeetCode0032Test {

    /**
     * 测试字符串为空的情况
     */
    @Test
    public void testEmpty() {
        LeetCode0032 leetCode0032 = new LeetCode0032();
        System.out.println(leetCode0032.longestValidParenthesesV1(""));
    }

    /**
     * 测试最长字符串
     */
    @Test
    public void testCommon() {
        LeetCode0032 leetCode0032 = new LeetCode0032();
        System.out.println(leetCode0032.longestValidParenthesesV1(")()())"));
    }

    /**
     * 测试字符串最后未匹配结束的情况
     */
    @Test
    public void testNotFinish() {
        LeetCode0032 leetCode0032 = new LeetCode0032();
        System.out.println(leetCode0032.longestValidParenthesesV1(")()()(()"));
    }

}
