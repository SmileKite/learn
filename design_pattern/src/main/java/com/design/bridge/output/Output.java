package com.design.bridge.output;

import com.design.bridge.message.MessageProcess;

/**
 * 对外输出抽象类（变化维度之一）
 * @author lizhenyu
 * @date 2021/6/27
 */
public abstract class Output {
    protected MessageProcess messageProcess;
    public Output(MessageProcess messageProcess) {
        this.messageProcess = messageProcess;
    }
    /**
     * 输出内容
     */
    public abstract void output();
}
