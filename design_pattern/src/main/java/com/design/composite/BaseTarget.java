package com.design.composite;

/**
 * 基础不可拆分类
 * @author lizhenyu
 * @date 2021/6/27
 */
public class BaseTarget extends Target {
    private int size;
    public BaseTarget(int size) {
        this.size = size;
    }
    @Override
    int count() {
        return 1;
    }
    @Override
    int size() {
        return this.size;
    }
}
