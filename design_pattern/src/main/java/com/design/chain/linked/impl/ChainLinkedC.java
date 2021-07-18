package com.design.chain.linked.impl;

import com.design.chain.linked.ChainLinked;
import com.google.common.annotations.VisibleForTesting;

/**
 * 目标实现类C
 * @author lizhenyu
 * @date 2021/7/11
 */
public class ChainLinkedC extends ChainLinked {
    @Override
    protected boolean doHandle() {
        System.out.println("执行targetC的逻辑");
        return result();
    }
    /**
     * 为了测试将执行是否成功提取到一个方法中，以便mock
     * @return 职责链当前环执行是否成功
     */
    @VisibleForTesting
    protected boolean result() {
        return Math.random() == 0;
    }
}
