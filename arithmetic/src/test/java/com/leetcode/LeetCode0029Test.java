package com.leetcode;

import org.junit.Test;

/**
 * @author lizhenyu
 * @date 2021/10/12
 */
public class LeetCode0029Test {

    @Test
    public void test1() {
        LeetCode0029 leetCode0029 = new LeetCode0029();

        System.out.println(leetCode0029.divide(2147483647, 2));
    }

    @Test
    public void test2() {
        LeetCode0029 leetCode0029 = new LeetCode0029();

        System.out.println(leetCode0029.divide(-2147483648, 2));
    }
}
