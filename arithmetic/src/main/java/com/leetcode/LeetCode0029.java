package com.leetcode;

/**
 * 0029--[两数相除]
 * 给定两个整数，被除数dividend和除数divisor。将两数相除，要求不使用乘法、除法和 mod 运算符。
 * 返回被除数dividend除以除数divisor得到的商。
 * 整数除法的结果应当截去（truncate）其小数部分，例如：truncate(8.345) = 8 以及 truncate(-2.7335) = -2
 * @author lizhenyu
 * @date 2021/10/12
 */
public class LeetCode0029 {

    /**
     * 计算两数相除
     * @param dividend 被除数
     * @param divisor 除数
     * @return 商
     */
    public int divide(int dividend, int divisor) {
        if (divisor == 1) {
            return dividend;
        }
        if (divisor == -1) {
            if (dividend == Integer.MIN_VALUE) {
                return Integer.MAX_VALUE;
            }
            return -dividend;
        }

        // 确定商的符号
        boolean symbol = true;
        if (dividend > 0) {
            dividend = -dividend;
            symbol = !symbol;
        }
        if (divisor > 0) {
            divisor = -divisor;
            symbol = !symbol;
        }

        // 被除数小于除数，商为0
        if (dividend > divisor) {
            return 0;
        }
        // 被除数与除数相等，商为正负1
        if (dividend == divisor) {
            return symbol ? 1 : -1;
        }

        return symbol ? getMinMul(dividend, divisor) : -getMinMul(dividend, divisor);
    }

    /**
     * 获取最小倍数
     * @param dividend 被除数
     * @param divisor 除数
     * @return 最小倍数
     */
    private int getMinMul(long dividend, long divisor) {
        int result = 1;
        long temp = divisor;
        while ((temp <<= 1) >= dividend) {
            result <<= 1;
        }
        dividend = dividend - (temp >> 1);
        if (dividend <= divisor) {
            result += getMinMul(dividend, divisor);
        }
        return result;
    }

}
