package com.leetcode;

/**
 * 0066--[加一]
 * 给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 * @author lizhenyu
 * @date 2021/10/21
 */
public class LeetCode0066 {

    /**
     * 加一
     * @param digits 代表数字的数组
     * @return 加1后的数字代表的数组
     */
    public int[] plusOne(int[] digits) {
        // 用于判断数组元素是否都是9
        boolean flag = true;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i]++;
                flag = false;
                break;
            }
        }
        if (flag) {
            digits = new int[digits.length+1];
            digits[0] = 1;
        }
        return digits;
    }
}
