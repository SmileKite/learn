package com.leetcode;

import org.junit.Test;

/**
 * @author lizhenyu
 * @date 2021/10/2
 */
public class LeetCode0405Test {

    /**
     * 测试正数
     */
    @Test
    public void testPositive() {
        LeetCode0405 leetCode0405 = new LeetCode0405();

        System.out.println(leetCode0405.toHex(26));
    }

    /**
     * 测试负数
     */
    @Test
    public void testNegative() {
        LeetCode0405 leetCode0405 = new LeetCode0405();

        System.out.println(leetCode0405.toHex(-1));
    }
}
