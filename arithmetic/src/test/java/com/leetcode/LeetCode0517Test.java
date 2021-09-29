package com.leetcode;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author lizhenyu
 * @date 2021/9/29
 */
public class LeetCode0517Test {

    /**
     * 测试返回-1的情况
     */
    @Test
    public void testError() {
        LeetCode0517 leetCode0517 = new LeetCode0517();

        System.out.println(leetCode0517.findMinMoves(new int[]{1, 0, 6}));
    }

    /**
     * 测试正常情况
     */
    @Test
    public void testCommon() {
        LeetCode0517 leetCode0517 = new LeetCode0517();

        System.out.println(leetCode0517.findMinMoves(new int[]{1, 0, 5}));
    }

}
