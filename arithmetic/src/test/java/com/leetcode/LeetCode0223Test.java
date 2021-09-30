package com.leetcode;

import org.junit.Test;

/**
 * @author lizhenyu
 * @date 2021/9/30
 */
public class LeetCode0223Test {

    /**
     * 测试没有覆盖的情况
     */
    @Test
    public void testEmpty() {
        LeetCode0223 leetCode0223 = new LeetCode0223();

        System.out.println(leetCode0223.computeArea(1, 1, 2, 2, 2, 1, 3, 5));
    }

    /**
     * 测试正常情况
     */
    @Test
    public void testCommon() {
        LeetCode0223 leetCode0223 = new LeetCode0223();

        System.out.println(leetCode0223.computeArea(-3, 0, 3, 4, 0, -1, 9, 2));
    }

}
