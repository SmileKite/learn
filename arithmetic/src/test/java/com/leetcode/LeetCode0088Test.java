package com.leetcode;

import org.junit.Test;

/**
 * @author lizhenyu
 * @date 2021/9/14
 */
public class LeetCode0088Test {

    @Test
    public void testMerge() {
        LeetCode0088 leetCode0088 = new LeetCode0088();

        int[] a = new int[] {1,2,3,0,0,0};
        int[] b = new int[] {2,5,6};
        int m = 3;
        int n = 3;
        leetCode0088.merge(a, m, b, n);
        print(a);
    }

    private void print(int[] array) {
        System.out.print("[");
        for (int c : array) {
            System.out.print(c);
        }
        System.out.print("]");
    }
}
