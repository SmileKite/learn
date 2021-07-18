package com.design.chain.array;

/**
 * 目标接口
 * @author lizhenyu
 * @date 2021/7/11
 */
public interface ITarget {
    /**
     * 方法执行
     * @return 是否跳出职责链（是否得到了想要的结果）
     */
    boolean action();
}
