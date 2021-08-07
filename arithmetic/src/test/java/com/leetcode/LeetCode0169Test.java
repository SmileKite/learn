package com.leetcode;

import org.junit.Test;

/**
 * @author lizhenyu
 * @date 2021/8/7
 */
public class LeetCode0169Test {

    /**
     * 测试多数元素
     */
    @Test
    public void testV1() {
        LeetCode0169 leetCode0169 = new LeetCode0169();
        System.out.println(leetCode0169.majorityElementV1(new int[]{2, 2, 1, 1, 1, 2, 2}));
    }

    /**
     * 测试多数元素
     */
    @Test
    public void testV2() {
        LeetCode0169 leetCode0169 = new LeetCode0169();
        System.out.println(leetCode0169.majorityElementV2(new int[]{2, 2, 1, 1, 1, 2, 2}));
    }
}
