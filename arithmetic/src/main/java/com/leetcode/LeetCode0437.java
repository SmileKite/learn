package com.leetcode;


import com.leetcode.entity.TreeNode;

/**
 * 0437--[路径总和 III]
 * 给定一个二叉树的根节点 root ，和一个整数 targetSum ，求该二叉树里节点值之和等于 targetSum 的 路径 的数目。
 * 路径 不需要从根节点开始，也不需要在叶子节点结束，但是路径方向必须是向下的（只能从父节点到子节点）。
 * @author lizhenyu
 * @date 2021/9/28
 */
public class LeetCode0437 {

    /**
     * 计算路径总和为x值的路径数目
     * @param root 二叉树
     * @param targetSum 和
     * @return 路径数目
     */
    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return 0;
        }

        int num = rootSum(root, targetSum);
        num += pathSum(root.left, targetSum);
        num += pathSum(root.right, targetSum);

        return num;
    }

    /**
     * 统计从根节点往下符合要求的路径数目
     * @param root 根节点
     * @param targetSum 要求值
     * @return 符合要求的路径数目
     */
    private int rootSum(TreeNode root, int targetSum) {
        if (root == null) {
            return 0;
        }
        int num = 0;
        int value = root.val;
        if (value == targetSum) {
            num++;
        }
        num += rootSum(root.left, targetSum-value);
        num += rootSum(root.right, targetSum-value);
        return num;
    }

}
