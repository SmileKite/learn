package com.leetcode;

/**
 * 0088--[合并两个有序数组]
 * 给你两个按 非递减顺序 排列的整数数组 nums1 和 nums2，另有两个整数 m 和 n ，分别表示 nums1 和 nums2 中的元素数目。
 * 请你 合并 nums2 到 nums1 中，使合并后的数组同样按 非递减顺序 排列。
 * 注意：最终，合并后数组不应由函数返回，而是存储在数组 nums1 中。为了应对这种情况，nums1 的初始长度为 m + n，其中前 m 个元素表示应合并的元素，后 n 个元素为 0 ，应忽略。nums2 的长度为 n 。
 * @author lizhenyu
 * @date 2021/9/14
 */
public class LeetCode0088 {

    /**
     * 合并有序数组，结果放在数组1中
     * @param nums1 数组1
     * @param m 数组1的长度
     * @param nums2 数组2
     * @param n 数组2的长度
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index1 = m-1;
        int index2 = n-1;
        int tail = m+n-1;
        int temp;
        while (index1 >= 0 || index2 >= 0) {
            if (index1 == -1) {
                temp = nums2[index2--];
            } else if (index2 == -1) {
                temp = nums1[index1--];
            } else if (nums1[index1] < nums2[index2]) {
                temp = nums2[index2--];
            } else {
                temp = nums1[index1--];
            }
            nums1[tail--] = temp;
        }
    }

}
