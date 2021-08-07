package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 0015--[三数之和]
 * 给你一个包含n个整数的数组nums，判断nums中是否存在三个元素a，b，c，使得a + b + c = 0？请你找出所有和为0且不重复的三元组。
 * @author lizhenyu
 * @date 2021/8/7
 */
public class LeetCode0015 {

    /**
     * 排序+双指针
     * @param nums 给定数组
     * @return 三数的所有可能
     */
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length < 3) {
            return result;
        }

        int len = nums.length;
        Arrays.sort(nums);
        // 第一次取数
        for (int i = 0, iLen = len-2; i < iLen; i++) {
            // 如果第一次取数都大于0，后续肯定不成立
            if (nums[i] > 0) {
                break;
            }
            // 重复数据跳过
            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            int target = -nums[i];
            int left = i+1;
            int right = len-1;
            while (left < right) {
                int temp = nums[left] + nums[right];
                if (target == temp) {
                    // 三数和为0
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while (left < right && nums[left] == nums[++left]) {}
                    while (left < right && nums[right] == nums[--right]) {}
                } else if (target > temp) {
                    // left右移
                    left++;
                } else {
                    // right左移
                    right--;
                }
            }
        }
        return result;
    }

}
