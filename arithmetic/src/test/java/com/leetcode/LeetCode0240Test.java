package com.leetcode;

import org.junit.Test;

/**
 * @author lizhenyu
 * @date 2021/10/25
 */
public class LeetCode0240Test {

    @Test
    public void test1() {
        LeetCode0240 leetCode0240 = new LeetCode0240();

        int[][] matrix = new int[5][5];
        matrix[0] = new int[]{1, 4, 7, 11, 15};
        matrix[1] = new int[]{2, 5, 8, 12, 19};
        matrix[2] = new int[]{3, 6, 9, 16, 22};
        matrix[3] = new int[]{10, 13, 14, 17, 24};
        matrix[4] = new int[]{18, 21, 23, 26, 30};

        System.out.println(leetCode0240.searchMatrix(matrix, 20));
    }

    @Test
    public void test2() {
        LeetCode0240 leetCode0240 = new LeetCode0240();

        int[][] matrix = new int[1][2];
        matrix[0] = new int[]{1, 1};

        System.out.println(leetCode0240.searchMatrix(matrix, 2));
    }
}
