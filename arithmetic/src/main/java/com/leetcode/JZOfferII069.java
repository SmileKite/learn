package com.leetcode;

/**
 * 剑指OfferⅡ069--[山峰数组的顶部]
 * 符合下列属性的数组 arr 称为 山峰数组（山脉数组） ：
 *      arr.length >= 3
 *      存在 i（0 < i < arr.length - 1）使得：
 *          arr[0] < arr[1] < ... arr[i-1] < arr[i]
 *          arr[i] > arr[i+1] > ... > arr[arr.length - 1]
 * 返回山峰顶部下标i
 * @author lizhenyu
 * @date 2021/10/14
 */
public class JZOfferII069 {

    /**
     * 获取山峰顶部下标
     * @param arr 数组
     * @return 顶部下标
     */
    public int peakIndexInMountainArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (true) {
            int mid = (right - left) / 2 + left;
            if (arr[mid] > arr[mid+1] && arr[mid] > arr[mid-1]) {
                return mid;
            }
            if (arr[mid-1] < arr[mid] && arr[mid] < arr[mid+1]) {
                left = mid;
            }
            if (arr[mid-1] > arr[mid] && arr[mid] > arr[mid+1]) {
                right = mid;
            }
        }
    }
}
