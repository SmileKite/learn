package com.leetcode;

import org.junit.Test;

import java.util.List;

/**
 * @author lizhenyu
 * @date 2021/10/27
 */
public class LeetCode0301Test {

    @Test
    public void test1() {
        LeetCode0301 leetCode0301 = new LeetCode0301();

        show(leetCode0301.removeInvalidParentheses(")("));
    }

    @Test
    public void test2() {
        LeetCode0301 leetCode0301 = new LeetCode0301();

        show(leetCode0301.removeInvalidParentheses("(a)())()"));
    }

    private void show(List<String> list) {
        for (String str : list) {
            System.out.print(str+ " ");
        }
    }
}
