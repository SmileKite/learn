package com.design.chain.array.impl;

import com.design.chain.array.ITarget;
import com.google.common.annotations.VisibleForTesting;

/**
 * 目标实现类A
 * @author lizhenyu
 * @date 2021/7/11
 */
public class TargetA implements ITarget {
    @Override
    public boolean action() {
        System.out.println("执行targetA的逻辑");
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
