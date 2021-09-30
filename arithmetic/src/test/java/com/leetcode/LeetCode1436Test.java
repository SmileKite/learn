package com.leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author lizhenyu
 * @date 2021/10/1
 */
public class LeetCode1436Test {

    @Test
    public void test() {
        LeetCode1436 leetCode1436 = new LeetCode1436();

        List<List<String>> paths = Arrays.asList(Arrays.asList("London", "New York"),
                Arrays.asList("New York","Lima"), Arrays.asList("Lima","Sao Paulo"));
        System.out.println(leetCode1436.destCity(paths));
    }

}
