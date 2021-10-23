package com.leetcode;

import org.junit.Test;

/**
 * @author lizhenyu
 * @date 2021/10/23
 */
public class LeetCode0492Test {

    @Test
    public void test() {
        LeetCode0492 leetCode0492 = new LeetCode0492();

        show(leetCode0492.constructRectangle(4));
    }

    private void show(int[] nums) {
        for (int num : nums) {
            System.out.println(num+ " ");
        }
    }
}
