package com.leetcode;

import org.junit.Test;

/**
 * @author lizhenyu
 * @date 2021/10/26
 */
public class LeetCode0496Test {

    @Test
    public void test() {
        LeetCode0496 leetCode0496 = new LeetCode0496();

        show(leetCode0496.nextGreaterElement(new int[]{4, 1, 2}, new int[] {1, 3, 4, 2}));
    }

    private void show(int[] nums) {
        for (int num : nums) {
            System.out.print(num+ " ");
        }
    }
}
