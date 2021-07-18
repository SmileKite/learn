package com.design.bridge.output.impl;

import com.design.bridge.message.MessageProcess;
import com.design.bridge.output.Output;

/**
 * 数据库输出
 * @author lizhenyu
 * @date 2021/6/27
 */
public class DataSourceOutput extends Output {
    public DataSourceOutput(MessageProcess messageProcess) {
        super(messageProcess);
    }
    @Override
    public void output() {
        System.out.println("输出到数据库："+ messageProcess.getMessage());
    }
}
