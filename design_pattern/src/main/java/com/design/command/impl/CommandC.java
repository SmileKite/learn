package com.design.command.impl;

import com.design.command.ICommand;

/**
 * 命令B
 * @author lizhenyu
 * @date 2021/7/18
 */
public class CommandC implements ICommand {
    /** 数据 */
    private String data;
    public CommandC(String data) {
        this.data = data;
    }
    @Override
    public void execute() {
        System.out.println("执行命令C，数据为"+data);
    }
}
