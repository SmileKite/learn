package com.leetcode;

import org.junit.Test;

import java.util.List;

/**
 * @author lizhenyu
 * @date 2021/10/16
 */
public class LeetCode0282Test {

    @Test
    public void test() {
        LeetCode0282 leetCode0282 = new LeetCode0282();

        show(leetCode0282.addOperators("232", 8));
    }

    private void show(List<String> list) {
        for (String str : list) {
            System.out.println(str);
        }
    }
}
