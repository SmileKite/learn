package com.leetcode;

import java.util.Map;
import java.util.TreeMap;

/**
 * 0352--[将数据流变为多个不相交区间]
 *  给你一个由非负整数 a1, a2, ..., an 组成的数据流输入，请你将到目前为止看到的数字总结为不相交的区间列表。
 *  实现 SummaryRanges 类：
 *      SummaryRanges() 使用一个空数据流初始化对象。
 *      void addNum(int val) 向数据流中加入整数 val 。
 *      int[][] getIntervals() 以不相交区间 [starti, endi] 的列表形式返回对数据流中整数的总结。
 * @author lizhenyu
 * @date 2021/10/9
 */
public class LeetCode0352 {

    private TreeMap<Integer, Integer> treeMap;

    public LeetCode0352() {
        treeMap = new TreeMap<>();
    }

    public void addNum(int val) {
        Map.Entry<Integer, Integer> interval1 = treeMap.ceilingEntry(val + 1);
        Map.Entry<Integer, Integer> interval0 = treeMap.floorEntry(val);
        if (interval0 != null && interval0.getKey() <= val && val <= interval0.getValue()) {
            return;
        } else {
            boolean left = interval0 != null && interval0.getValue() + 1 == val;
            boolean right = interval1 != null && interval1.getKey() - 1 == val;
            if (left && right) {
                int l = interval0.getKey();
                int r = interval1.getValue();
                treeMap.remove(interval0.getKey());
                treeMap.remove(interval1.getKey());
                treeMap.put(l, r);
            } else if (left) {
                treeMap.put(interval0.getKey(), val);
            } else if (right) {
                treeMap.put(val, interval1.getValue());
                treeMap.remove(interval1.getKey());
            } else {
                treeMap.put(val, val);
            }
        }
    }

    public int[][] getIntervals() {
        int size = treeMap.size();
        int[][] ans = new int[size][2];
        int index = 0;
        for (Map.Entry<Integer, Integer> entry : treeMap.entrySet()) {
            int left = entry.getKey(), right = entry.getValue();
            ans[index][0] = left;
            ans[index][1] = right;
            ++index;
        }
        return ans;
    }

}
