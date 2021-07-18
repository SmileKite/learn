package com.design.bridge.message.impl;

import com.design.bridge.message.MessageProcess;

/**
 * 普通的信息处理器
 * @author lizhenyu
 * @date 2021/6/27
 */
public class CommonMessageProcess extends MessageProcess {
    public CommonMessageProcess(String message) {
        super(message);
    }
    @Override
    public String getMessage() {
        return "输出结果为："+this.message;
    }
}
