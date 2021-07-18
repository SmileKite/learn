package com.design.bridge.output.impl;

import com.design.bridge.message.MessageProcess;
import com.design.bridge.output.Output;

/**
 * 输出到控制台
 * @author lizhenyu
 * @date 2021/6/27
 */
public class ConsoleOutput extends Output {
    public ConsoleOutput(MessageProcess messageProcess) {
        super(messageProcess);
    }
    @Override
    public void output() {
        System.out.println("输出到控制台："+ messageProcess.getMessage());
    }
}
