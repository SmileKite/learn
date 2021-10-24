package com.leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author lizhenyu
 * @date 2021/10/24
 */
public class LeetCode0638Test {

    @Test
    public void test() {
        LeetCode0638 leetCode0638 = new LeetCode0638();

        List<Integer> price = Arrays.asList(2, 3, 4);
        List<List<Integer>> special = Arrays.asList(Arrays.asList(1, 1, 0, 4), Arrays.asList(2, 2, 1, 9));
        List<Integer> needs = Arrays.asList(1, 2, 1);

        System.out.println(leetCode0638.shoppingOffers(price, special, needs));
    }
}
