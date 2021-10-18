package com.leetcode;

/**
 * 0476--[数字的补数]
 * 给你一个 正 整数 num ，输出它的补数。补数是对该数的二进制表示取反。
 *      给定的整数 num 保证在 32 位带符号整数的范围内。
 *      num >= 1
 *      你可以假定二进制数不包含前导零位。
 *      本题与1009相同
 * @author lizhenyu
 * @date 2021/10/18
 */
public class LeetCode0476 {

    /**
     * 使用高一位的1000..-num-1来获取补位
     * @param num 要计算的数字
     * @return 数字的补数
     */
    public int findComplement(int num) {
        long result = 1;
        while (result <= num) {
            result <<= 1;
        }
        return (int) (result - num - 1);
    }
}
