package com.leetcode;

import java.util.Arrays;

/**
 * 0869--[重新排序得到2的幂]
 * 给定正整数 N ，我们按任何顺序（包括原始顺序）将数字重新排序，注意其前导数字不能为零。
 * 如果我们可以通过上述方式得到 2 的幂，返回 true；否则，返回 false。
 *      1 <= N <= 10^9
 * @author lizhenyu
 * @date 2021/10/28
 */
public class LeetCode0869 {

    /**
     * 用于记录回溯过程中哪些数字已经被使用
     */
    private boolean[] records;

    public boolean reorderedPowerOf2(int n) {
        char[] nums = String.valueOf(n).toCharArray();
        Arrays.sort(nums);
        records = new boolean[nums.length];
        return backtrack(nums, 0);
    }

    private boolean backtrack(char[] nums, int num) {
        if (String.valueOf(num).length() == nums.length) {
            return check(num);
        }
        for (int i = 0, len = nums.length; i < len; i++) {
            if (num == 0 && nums[i] == '0' || records[i] || i > 0 && !records[i-1] && nums[i] == nums[i-1]) {
                continue;
            }
            // true表示该数字已经被使用
            records[i] = true;
            if (backtrack(nums, num * 10 + nums[i] - '0')) {
                return true;
            }
            // false表示该数字还没有被使用
            records[i] = false;
        }
        return false;
    }

    private boolean check(int num) {
        return (num & (num-1)) == 0;
    }
}
