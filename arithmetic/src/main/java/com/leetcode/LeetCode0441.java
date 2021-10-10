package com.leetcode;

/**
 * 0441--[排列硬币]
 * 你总共有 n 枚硬币，并计划将它们按阶梯状排列。对于一个由 k 行组成的阶梯，其第 i 行必须正好有 i 枚硬币。阶梯的最后一行 可能 是不完整的。
 * 给你一个数字 n ，计算并返回可形成 完整阶梯行 的总行数。
 * @author lizhenyu
 * @date 2021/10/10
 */
public class LeetCode0441 {

    /**
     * 获取完整阶梯行的总行数
     * @param n 硬币数
     * @return 总行数
     */
    public int arrangeCoins(int n) {
        int left = 1;
        int right = n;
        while (true) {
            int mid = (right - left) / 2 + left;
            if ((long) mid * (1+mid) == 2L * n) {
                return mid;
            } else if ((long) mid * (1+mid) < 2L * n) {
                if (left == mid) {
                    return left;
                }
                left = mid;
            } else {
                if (right == mid) {
                    return left;
                }
                right = mid;
            }
        }
    }
}
