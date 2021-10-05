package com.leetcode;

import org.junit.Test;

/**
 * @author lizhenyu
 * @date 2021/10/4
 */
public class LeetCode0482Test {

    /**
     * 测试为空的情况
     */
    @Test
    public void testEmpty() {
        LeetCode0482 leetCode0482 = new LeetCode0482();

        System.out.println(leetCode0482.licenseKeyFormatting("---", 2));
    }

    /**
     * 测试正常的情况
     */
    @Test
    public void testCommon() {
        LeetCode0482 leetCode0482 = new LeetCode0482();

        System.out.println(leetCode0482.licenseKeyFormatting("2-5g-3-J", 2));
    }
}
