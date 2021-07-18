package com.design.bridge;

import com.design.bridge.message.impl.CommonMessageProcess;
import com.design.bridge.message.impl.EncryptionMessageProcess;
import com.design.bridge.message.impl.RichMessageProcess;
import com.design.bridge.output.Output;
import com.design.bridge.output.impl.ConsoleOutput;
import com.design.bridge.output.impl.DataSourceOutput;
import com.design.bridge.output.impl.EmailOutput;
import org.junit.Test;

/**
 * 桥接模式测试
 * @author lizhenyu
 * @date 2021/6/27
 */
public class BridgeTest {

    /**
     * 测试桥接模式
     */
    @Test
    public void testBridge() {
        // 入库加密
        Output dataSourceOutput = new DataSourceOutput(new EncryptionMessageProcess("smileKite"));
        dataSourceOutput.output();
        // 发电子邮件
        Output emailOutput = new EmailOutput(new RichMessageProcess("谢谢"));
        emailOutput.output();
        // 控制台显示
        Output consoleOutput = new ConsoleOutput(new CommonMessageProcess("呜啦啦"));
        consoleOutput.output();
    }
}
