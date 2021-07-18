package com.design.chain.linked;

/**
 * 目标抽象类
 * @author lizhenyu
 * @date 2021/7/11
 */
public abstract class ChainLinked {
    protected ChainLinked next;
    public void setNext(ChainLinked next) {
        this.next = next;
    }

    /**
     * 职责链执行
     */
    public final void handle() {
        boolean result = doHandle();
        if (next != null && !result) {
            next.handle();
        }
    }
    /**
     * 执行具体逻辑
     * @return 是否获取了需要的结果
     */
    protected abstract boolean doHandle();
}
