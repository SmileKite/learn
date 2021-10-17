package com.leetcode;

import com.leetcode.entity.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 0230--[二叉搜索树中第K小的元素]
 * 给定一个二叉搜索树的根节点 root ，和一个整数 k ，请你设计一个算法查找其中第 k 个最小元素（从 1 开始计数）。
 * 进阶：如果二叉搜索树经常被修改（插入/删除操作）并且你需要频繁地查找第 k 小的值，你将如何优化算法？
 *      树中的节点数为 n 。
 *      1 <= k <= n <= 104
 *      0 <= Node.val <= 104
 * @author lizhenyu
 * @date 2021/10/17
 */
public class LeetCode0230 {

    /**
     * 中序遍历对二叉搜索树排序来获取第k小元素
     * @param root 根节点
     * @param k 获取第k小元素
     * @return 第k小元素
     */
    public int kthSmallest(TreeNode root, int k) {
        Deque<TreeNode> deque = new ArrayDeque<>();
        while (root != null || !deque.isEmpty()) {
            while (root != null) {
                // 将左节点遍历加入到栈中（栈中元素越靠近栈顶，值越小，同时，栈顶元素为二叉搜索树除pop元素外的最小值）
                deque.push(root);
                root = root.left;
            }
            root = deque.pop();
            if (--k == 0) {
                break;
            }
            root = root.right;
        }
        return root.val;
    }
}
