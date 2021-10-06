package com.leetcode;

import java.util.TreeSet;

/**
 * 0414--[第三大的数]
 * 给你一个非空数组，返回此数组中 第三大的数 。如果不存在，则返回数组中最大的数。
 * @author lizhenyu
 * @date 2021/10/6
 */
public class LeetCode0414 {

    /**
     * 获取第三大的数
     * @param nums 数组
     * @return 第三大的数
     */
    public int thirdMax(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int num : nums) {
            set.add(num);
            if (set.size() > 3) {
                set.remove(set.first());
            }
        }
        return set.size() == 3 ? set.first() : set.last();
    }
}
