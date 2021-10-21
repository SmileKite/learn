package com.leetcode;

import org.junit.Test;

/**
 * @author lizhenyu
 * @date 2021/10/21
 */
public class LeetCode0066Test {

    @Test
    public void test1() {
        LeetCode0066 leetCode0066 = new LeetCode0066();

        show(leetCode0066.plusOne(new int[] {9, 9, 9}));
    }

    @Test
    public void test2() {
        LeetCode0066 leetCode0066 = new LeetCode0066();

        show(leetCode0066.plusOne(new int[] {2, 5, 9}));
    }

    private void show(int[] nums) {
        for (int num : nums) {
            System.out.print(num+ " ");
        }
    }
}
