package com.design.bridge.output.impl;

import com.design.bridge.message.MessageProcess;
import com.design.bridge.output.Output;

/**
 * 邮件输出
 * @author lizhenyu
 * @date 2021/6/27
 */
public class EmailOutput extends Output {
    public EmailOutput(MessageProcess messageProcess) {
        super(messageProcess);
    }
    @Override
    public void output() {
        System.out.println("输出到邮件："+ messageProcess.getMessage());
    }
}
