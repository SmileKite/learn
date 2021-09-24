package com.leetcode;

import com.leetcode.entity.BListNode;
import org.junit.Test;

/**
 * @author lizhenyu
 * @date 2021/9/24
 */
public class LeetCode0430Test {

    /**
     * 测试空链表
     */
    @Test
    public void testEmpty() {
        LeetCode0430 leetCode0430 = new LeetCode0430();

        BListNode oneOne = new BListNode(1);
        showListNode(leetCode0430.flatten(oneOne));
    }

    /**
     * 测试扁平化多级双向链表
     */
    @Test
    public void testCommon() {
        LeetCode0430 leetCode0430 = new LeetCode0430();

        BListNode oneOne = new BListNode(1);
        BListNode oneTwo = new BListNode(2);
        BListNode oneThree = new BListNode(3);
        BListNode oneFour = new BListNode(4);
        BListNode oneFive = new BListNode(5);
        BListNode oneSix = new BListNode(6);
        BListNode twoOne = new BListNode(7);
        BListNode twoTwo = new BListNode(8);
        BListNode twoThree = new BListNode(9);
        BListNode twoFour = new BListNode(10);
        BListNode threeOne = new BListNode(11);
        BListNode threeTwo = new BListNode(12);
        oneOne.next = oneTwo;
        oneTwo.next = oneThree;
        oneTwo.prev = oneOne;
        oneThree.next = oneFour;
        oneThree.prev = oneTwo;
        oneThree.child = twoOne;
        twoOne.next = twoTwo;
        twoTwo.next = twoThree;
        twoTwo.prev = twoOne;
        twoTwo.child = threeOne;
        threeOne.next = threeTwo;
        threeTwo.prev = threeOne;
        twoThree.next = twoFour;
        twoThree.prev = twoTwo;
        twoFour.prev = twoThree;
        oneFour.next = oneFive;
        oneFour.prev = oneThree;
        oneFive.next = oneSix;
        oneFive.prev = oneFour;
        oneSix.prev = oneFive;

        showListNode(leetCode0430.flatten(oneOne));
    }

    private void showListNode(BListNode node) {
        while (node != null) {
            int val = node.val;
            int prev = node.prev == null ? -1 : node.prev.val;
            int next = node.next == null ? -1 : node.next.val;
            int child = node.child == null ? -1 : node.child.val;
            System.out.println("prev:"+prev+", val:"+val+",child:"+child+",next:"+next);
            node = node.next;
        }
    }
}
