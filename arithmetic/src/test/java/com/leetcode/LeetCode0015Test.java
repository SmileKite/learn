package com.leetcode;

import org.junit.Test;

import java.util.List;

/**
 * @author lizhenyu
 * @date 2021/8/7
 */
public class LeetCode0015Test {

    /**
     * 测试数组为null的情况
     */
    @Test
    public void testNull() {
        LeetCode0015 leetCode0015 = new LeetCode0015();
        print(leetCode0015.threeSum(null));
    }

    /**
     * 测试数组为空的情况
     */
    @Test
    public void testEmpty() {
        LeetCode0015 leetCode0015 = new LeetCode0015();
        print(leetCode0015.threeSum(new int[]{}));
    }

    /**
     * 测试数组数量不足的情况
     */
    @Test
    public void testNoEnough() {
        LeetCode0015 leetCode0015 = new LeetCode0015();
        print(leetCode0015.threeSum(new int[]{1, 2}));
    }

    /**
     * 测试全为0的情况
     */
    @Test
    public void testAllZero() {
        LeetCode0015 leetCode0015 = new LeetCode0015();
        print(leetCode0015.threeSum(new int[]{0, 0, 0, 0, 0, 0, 0, 0}));
    }

    /**
     * 测试数据
     */
    @Test
    public void testNormal() {
        LeetCode0015 leetCode0015 = new LeetCode0015();
        print(leetCode0015.threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
    }

    private void print(List<List<Integer>> lists) {
        System.out.print("[");
        for (List<Integer> list : lists) {
            System.out.print("[");
            for (Integer integer : list) {
                System.out.print(" " +integer+" ");
            }
            System.out.print("]");
        }
        System.out.print("]");
    }
}
