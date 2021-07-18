package com.design.command;

import com.design.command.impl.CommandA;
import com.design.command.impl.CommandB;
import com.design.command.impl.CommandC;

/**
 * 命令工厂
 * @author lizhenyu
 * @date 2021/7/18
 */
public class CommandFactory {
    private static final String A = "CommandA";
    private static final String B = "CommandB";
    private static final String C = "CommandC";
    public ICommand createCommand(String type, String data) {
        if (A.equals(type)) {
            return new CommandA(data);
        } else if (B.equals(type)) {
            return new CommandB(data);
        } else if (C.equals(type)) {
            return new CommandC(data);
        } else {
            throw new IllegalArgumentException("type is null or not exist");
        }
    }
}
