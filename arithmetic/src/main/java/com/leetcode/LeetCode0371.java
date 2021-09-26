package com.leetcode;

/**
 * 0371--[两整数之和]
 * 给你两个整数 a 和 b ，不使用 运算符 + 和 - ，计算并返回两整数之和。
 * @author lizhenyu
 * @date 2021/9/26
 */
public class LeetCode0371 {

    /**
     * 两整数之和
     * 异或 与 位移计算
     * @param a 整数a
     * @param b 整数b
     * @return 两数之和
     */
    public int getSum(int a, int b) {
        while (b != 0) {
            int temp = (a & b) << 1;
            a = a ^ b;
            b = temp;
        }
        return a;
    }
}
