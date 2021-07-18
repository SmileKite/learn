package com.design.command;

import org.junit.Test;

/**
 * 命令模式测试类
 * @author lizhenyu
 * @date 2021/7/18
 */
public class CommandTest {
    /**
     * 测试类型为null的情况
     */
    @Test(expected = IllegalArgumentException.class)
    public void testNull() {
        CommandFactory factory = new CommandFactory();
        ICommand data = factory.createCommand(null, "data");
        data.execute();
    }

    /**
     * 测试类型不存在的情况
     */
    @Test(expected = IllegalArgumentException.class)
    public void testNotExist() {
        CommandFactory factory = new CommandFactory();
        ICommand data = factory.createCommand("CommandD", "data");
        data.execute();
    }

    /**
     * 测试命令模式
     */
    @Test
    public void testCommand() {
        CommandFactory factory = new CommandFactory();
        ICommand commandA = factory.createCommand("CommandA", "dataA");
        ICommand commandC = factory.createCommand("CommandC", "dataC");
        commandA.execute();
        commandC.execute();
    }
}
