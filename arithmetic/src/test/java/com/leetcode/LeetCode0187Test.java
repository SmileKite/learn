package com.leetcode;

import org.junit.Test;

/**
 * @author lizhenyu
 * @date 2021/10/8
 */
public class LeetCode0187Test {

    @Test
    public void test1() {
        LeetCode0187 leetCode0187 = new LeetCode0187();

        System.out.println(leetCode0187.findRepeatedDnaSequences("AAAAAAAAAAA"));
    }

    @Test
    public void test2() {
        LeetCode0187 leetCode0187 = new LeetCode0187();

        System.out.println(leetCode0187.findRepeatedDnaSequences("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"));
    }
}
