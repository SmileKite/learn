package com.leetcode;

import org.junit.Test;

/**
 * @author lizhenyu
 * @date 2021/10/8
 */
public class LeetCode0187Test {

    /**
     * 测试只有一种字符的情况
     */
    @Test
    public void test1() {
        LeetCode0187 leetCode0187 = new LeetCode0187();

        System.out.println(leetCode0187.findRepeatedDnaSequences("AAAAAAAAAAA"));
    }
}
