package com.leetcode;

/**
 * 0240--[搜索二维矩阵 II]
 * 编写一个高效的算法来搜索 m x n 矩阵 matrix 中的一个目标值 target 。该矩阵具有以下特性：
 *      m == matrix.length
 *      n == matrix[i].length
 *      1 <= n, m <= 300
 *      -10^9 <= matrix[i][j] <= 10^9
 *      每行的所有元素从左到右升序排列
 *      每列的所有元素从上到下升序排列
 *      -10^9 <= target <= 10^9
 * @author lizhenyu
 * @date 2021/10/25
 */
public class LeetCode0240 {

    public boolean searchMatrix(int[][] matrix, int target) {
        int x = matrix[0].length - 1;
        int y = 0;

        while (x >= 0 && y < matrix.length) {
            if (matrix[y][x] == target) {
                return true;
            }
            if (matrix[y][x] < target) {
                y++;
            } else {
                x--;
            }
        }
        return false;
    }
}
