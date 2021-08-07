package com.leetcode;

import java.util.Arrays;

/**
 * 0169--[多数元素]
 * 给定一个大小为n的数组，找到其中的多数元素。多数元素是指在数组中出现次数大于n/2的元素。
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 *
 * 进阶：尝试设计时间复杂度为 O(n)、空间复杂度为 O(1) 的算法解决此问题。
 * @author lizhenyu
 * @date 2021/8/7
 */
public class LeetCode0169 {
    /**
     * 排序解法
     * @param nums 要查找的数组
     * @return 多数元素
     */
    public int majorityElementV1(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }

    /**
     * 投票算法
     * @param nums 要查找的数组
     * @return 多数元素
     */
    public int majorityElementV2(int[] nums) {
        int count = 0;
        Integer target = null;
        for (int num : nums) {
            if (count == 0) {
                count++;
                target = num;
            } else if (target == num) {
                count++;
            } else {
                count--;
            }
        }
        return target;
    }

}
