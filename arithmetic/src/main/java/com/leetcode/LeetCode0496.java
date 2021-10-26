package com.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

/**
 * 0496--[下一个更大元素 I]
 * 给你两个 没有重复元素 的数组 nums1 和 nums2 ，其中nums1 是 nums2 的子集。
 * 请你找出 nums1 中每个元素在 nums2 中的下一个比其大的值。
 * nums1 中数字 x 的下一个更大元素是指 x 在 nums2 中对应位置的右边的第一个比 x 大的元素。如果不存在，对应位置输出 -1 。
 *      1 <= nums1.length <= nums2.length <= 1000
 *      0 <= nums1[i], nums2[i] <= 104
 *      nums1和nums2中所有整数 互不相同
 *      nums1 中的所有整数同样出现在 nums2 中
 * @author lizhenyu
 * @date 2021/10/26
 */
public class LeetCode0496 {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        Deque<Integer> deque = new ArrayDeque<>();
        // 计算nums2数组中每一个元素的下一个比其大的值
        for (int num : nums2) {
            while (!deque.isEmpty() && deque.peek() < num) {
                map.put(deque.pop(), num);
            }
            deque.push(num);
        }
        // 获取num1中的每个元素对应nums2中的下一个比其大的值
        int len = nums1.length;
        int[] result = new int[len];
        for (int i = 0; i < len; i++) {
            result[i] = map.getOrDefault(nums1[i], -1);
        }
        return result;
    }

}
