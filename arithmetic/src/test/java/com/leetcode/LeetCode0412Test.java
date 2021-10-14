package com.leetcode;

import org.junit.Test;

import java.util.List;

/**
 * @author lizhenyu
 * @date 2021/10/13
 */
public class LeetCode0412Test {

    @Test
    public void test() {
        LeetCode0412 leetCode0412 = new LeetCode0412();

        show(leetCode0412.fizzBuzz(15));
    }

    private void show(List<String> list) {
        System.out.print("[");
        for (String str : list) {
            System.out.print(str+ " ");
        }
        System.out.print("]");
    }
}
