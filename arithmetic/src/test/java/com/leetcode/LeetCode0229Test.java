package com.leetcode;

import org.junit.Test;

import java.util.List;

/**
 * @author lizhenyu
 * @date 2021/10/22
 */
public class LeetCode0229Test {

    @Test
    public void test() {
        LeetCode0229 leetCode0229 = new LeetCode0229();

        show(leetCode0229.majorityElement(new int[] {1,1,1,3,3,2,2,2}));
    }

    private void show(List<Integer> list) {
        for (Integer num : list) {
            System.out.print(num+ " ");
        }
    }
}
