package com.design.composite;

/**
 * 组合模式抽象类
 * @author lizhenyu
 * @date 2021/6/27
 */
public abstract class Target {
    /**
     * 计数
     * @return 总数量
     */
    abstract int count();
    /**
     * 计算大小
     * @return 大小
     */
    abstract int size();
}
