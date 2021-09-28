package com.leetcode;

import com.leetcode.entity.TreeNode;
import org.junit.Test;

/**
 * @author lizhenyu
 * @date 2021/9/28
 */
public class LeetCode0437Test {

    @Test
    public void test() {
        LeetCode0437 leetCode0437 = new LeetCode0437();

        TreeNode root = new TreeNode(10);
        TreeNode t1 = new TreeNode(5);
        TreeNode t2 = new TreeNode(-3);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(2);
        TreeNode t5 = new TreeNode(11);
        TreeNode t6 = new TreeNode(3);
        TreeNode t7 = new TreeNode(-2);
        TreeNode t8 = new TreeNode(1);

        root.left = t1;
        root.right = t2;
        t1.left = t3;
        t1.right = t4;
        t2.right = t5;
        t3.left = t6;
        t3.right = t7;
        t4.right = t8;

        System.out.println(leetCode0437.pathSum(root, 8));
    }
}
