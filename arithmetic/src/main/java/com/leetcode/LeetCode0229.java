package com.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 0229--[求众数 II]
 * 给定一个大小为 n 的整数数组，找出其中所有出现超过 ⌊ n/3 ⌋ 次的元素。
 *      1 <= nums.length <= 5 * 10 ^ 4
 *      -10^9 <= nums[i] <= 10^9
 * 进阶：尝试设计时间复杂度为 O(n)、空间复杂度为 O(1)的算法解决此问题。
 * @author lizhenyu
 * @date 2021/10/22
 */
public class LeetCode0229 {

    /**
     * 使用摩尔投票法求解
     * @param nums 整数数组
     * @return 众数
     */
    public List<Integer> majorityElement(int[] nums) {
        int n1 = 0;
        int n2 = 0;
        int count1 = 0;
        int count2 = 0;
        List<Integer> result = new ArrayList<>();

        // 阶段1：投票
        for (int num : nums) {
            if (count1 > 0 && num == n1) {
                count1++;
            } else if (count2 > 0 && num == n2) {
                count2++;
            } else if (count1 == 0) {
                n1 = num;
                count1++;
            } else if (count2 == 0) {
                n2 = num;
                count2++;
            } else {
                count1--;
                count2--;
            }
        }

        // 阶段2：验证
        if (count1 > 0) {
            count1 = 0;
            for (int num : nums) {
                if (num == n1) {
                    count1++;
                }
            }
        }
        if (count2 > 0) {
            count2 = 0;
            for (int num : nums) {
                if (num == n2) {
                    count2++;
                }
            }
        }
        if (count1 > nums.length/3) {
            result.add(n1);
        }
        if (count2 > nums.length/3) {
            result.add(n2);
        }

        return result;
    }

}
