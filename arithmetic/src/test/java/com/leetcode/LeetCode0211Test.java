package com.leetcode;

import org.junit.Test;

/**
 * @author lizhenyu
 * @date 2021/10/19
 */
public class LeetCode0211Test {

    @Test
    public void test() {
        LeetCode0211 leetCode0211 = new LeetCode0211();
        leetCode0211.addWord("bad");
        leetCode0211.addWord("dad");
        leetCode0211.addWord("mad");
        leetCode0211.addWord("pad");

        System.out.println(leetCode0211.search("bad"));
        System.out.println(leetCode0211.search(".ad"));
        System.out.println(leetCode0211.search("b.."));
    }
}
