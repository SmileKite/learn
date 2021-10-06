package com.leetcode;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author lizhenyu
 * @date 2021/10/6
 */
public class LeetCode0414Test {

    /**
     * 测试数组不足3个的情况
     */
    @Test
    public void testLess() {
        LeetCode0414 leetCode0414 = new LeetCode0414();

        System.out.println(leetCode0414.thirdMax(new int[] {2, 1}));
    }
    
    /**
     * 测试数组超过3个的情况
     */
    @Test
    public void testMore() {
        LeetCode0414 leetCode0414 = new LeetCode0414();

        System.out.println(leetCode0414.thirdMax(new int[] {2, 2, 3, 1}));
    }
}
