package com.leetcode;

import com.leetcode.entity.TreeNode;
import org.junit.Test;

/**
 * @author lizhenyu
 * @date 2021/10/17
 */
public class LeetCode0230Test {

    @Test
    public void test() {
        LeetCode0230 leetCode0230 = new LeetCode0230();

        TreeNode root = new TreeNode(5);
        TreeNode one = new TreeNode(3);
        TreeNode two = new TreeNode(6);
        TreeNode three = new TreeNode(2);
        TreeNode four = new TreeNode(4);
        TreeNode five = new TreeNode(1);
        root.left = one;
        root.right = two;
        one.left = three;
        one.right = four;
        three.left = five;

        System.out.println(leetCode0230.kthSmallest(root, 3));
    }

}
