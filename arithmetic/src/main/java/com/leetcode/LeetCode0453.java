package com.leetcode;

import java.util.Arrays;

/**
 * 0453--[最小操作次数使数组元素相等]
 * 给你一个长度为 n 的整数数组，每次操作将会使 n - 1 个元素增加 1 。返回让数组所有元素相等的最小操作次数。
 * @author lizhenyu
 * @date 2021/10/20
 */
public class LeetCode0453 {

    public int minMoves(int[] nums) {
        int min = Arrays.stream(nums).min().getAsInt();
        int moves = 0;
        for (int num : nums) {
            moves += num-min;
        }
        return moves;
    }
}
