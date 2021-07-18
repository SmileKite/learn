package com.design.bridge.message;

/**
 * 信息处理器（变化维度之一）
 * @author lizhenyu
 * @date 2021/6/27
 */
public abstract class MessageProcess {
    protected String message;
    public MessageProcess(String message) {
        this.message = message;
    }
    /**
     * 获取输出数据
     * @return 输出数据
     */
    public abstract String getMessage();
}
