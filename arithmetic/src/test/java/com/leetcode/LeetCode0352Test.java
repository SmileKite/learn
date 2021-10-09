package com.leetcode;

import org.junit.Test;

/**
 * @author lizhenyu
 * @date 2021/10/9
 */
public class LeetCode0352Test {

    @Test
    public void test() {
        LeetCode0352 leetCode0352 = new LeetCode0352();

        leetCode0352.addNum(1);
        show(leetCode0352.getIntervals());
        leetCode0352.addNum(3);
        show(leetCode0352.getIntervals());
        leetCode0352.addNum(7);
        show(leetCode0352.getIntervals());
        leetCode0352.addNum(2);
        show(leetCode0352.getIntervals());
        leetCode0352.addNum(6);
        show(leetCode0352.getIntervals());
    }

    private void show(int[][] values) {
        for (int[] value : values) {
            for (int val : value) {
                System.out.print(val+" ");
            }
            System.out.println("");
        }
        System.out.println("-----------------------------");
    }
}
