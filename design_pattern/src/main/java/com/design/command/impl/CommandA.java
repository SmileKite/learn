package com.design.command.impl;

import com.design.command.ICommand;

/**
 * 命令A
 * @author lizhenyu
 * @date 2021/7/18
 */
public class CommandA implements ICommand {
    /** 数据 */
    private String data;
    public CommandA(String data) {
        this.data = data;
    }
    @Override
    public void execute() {
        System.out.println("执行命令A，数据为"+data);
    }
}
