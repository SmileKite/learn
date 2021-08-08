package com.leetcode;

import org.junit.Test;

/**
 * @author lizhenyu
 * @date 2021/8/8
 */
public class LeetCode0041Test {

    /**
     * 测试缺失的第一个正整数是1的情况
     */
    @Test
    public void testNoHead() {
        LeetCode0041 leetCode0041 = new LeetCode0041();
        System.out.println(leetCode0041.firstMissingPositive(new int[]{7, 8, 9, 11, 12}));
    }

    /**
     * 测试包含负数的情况
     */
    @Test
    public void testHasNegative() {
        LeetCode0041 leetCode0041 = new LeetCode0041();
        System.out.println(leetCode0041.firstMissingPositive(new int[]{7, -1, -2, 0, 12}));
    }

    /**
     * 测试正常情况
     */
    @Test
    public void testCommon() {
        LeetCode0041 leetCode0041 = new LeetCode0041();
        System.out.println(leetCode0041.firstMissingPositive(new int[]{1, 2, 0}));
    }
}
