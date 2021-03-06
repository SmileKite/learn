package com.leetcode;

/**
 * 0492--[构造矩形]
 * 作为一位web开发者，懂得怎样去规划一个页面的尺寸是很重要的。现给定一个具体的矩形页面面积，你的任务是设计一个长度为L和宽度为W且满足以下要求的矩形的页面。要求：
 *      1. 你设计的矩形页面必须等于给定的目标面积。
 *      2. 宽度 W 不应大于长度 L，换言之，要求 L >= W 。
 *      3. 长度 L 和宽度 W 之间的差距应当尽可能小。
 * 你需要按顺序输出你设计的页面的长度 L 和宽度 W。
 *      给定的面积不大于 10,000,000 且为正整数。
 *      你设计的页面的长度和宽度必须都是正整数。
 * @author lizhenyu
 * @date 2021/10/23
 */
public class LeetCode0492 {

    public int[] constructRectangle(int area) {
        int sqrt = (int) Math.sqrt(area);
        while (area % sqrt != 0) {
            sqrt--;
        }
        return new int[] {area/sqrt, sqrt};
    }
}
