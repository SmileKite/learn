package com.leetcode;

import org.junit.Test;

/**
 * @author lizhenyu
 * @date 2021/9/25
 */
public class LeetCode0583Test {

    /**
     * 测试字符串为空的情况
     */
    @Test
    public void testEmpty() {
        LeetCode0583 leetCode0583 = new LeetCode0583();

        String word1 = "";
        String word2 = "abc";
        System.out.println(leetCode0583.minDistance(word1, word2));
    }

    /**
     * 测试正常情况
     */
    @Test
    public void testCommon() {
        LeetCode0583 leetCode0583 = new LeetCode0583();

        String word1 = "sea";
        String word2 = "eat";
        System.out.println(leetCode0583.minDistance(word1, word2));
    }
}
