package com.leetcode;

/**
 * 0041--[缺失的第一个正数]
 * 给你一个未排序的整数数组 nums ，请你找出其中没有出现的最小的正整数。
 * 请你实现时间复杂度为 O(n) 并且只使用常数级别额外空间的解决方案。
 * @author lizhenyu
 * @date 2021/8/7
 */
public class LeetCode0041 {

    /**
     * 置换法
     * @param nums 整数数组
     * @return 没有出现的最小正整数
     */
    public int firstMissingPositive(int[] nums) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            while (nums[i] > 0 && nums[i] < len && nums[nums[i]-1] != nums[i]) {
                int temp = nums[i];
                nums[i] = nums[temp-1];
                nums[temp-1] = temp;
            }
        }
        for (int i = 0; i < len; ) {
            if (nums[i] != ++i) {
                return i;
            }
        }
        return len+1;
    }
}
