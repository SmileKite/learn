package com.design.bridge.message.impl;

import com.design.bridge.message.MessageProcess;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 信息丰富处理器
 * @author lizhenyu
 * @date 2021/6/27
 */
public class RichMessageProcess extends MessageProcess {
    private static final DateFormat FORMAT = new SimpleDateFormat("yyyy年MM月dd日");
    public RichMessageProcess(String message) {
        super(message);
    }
    @Override
    public String getMessage() {
        Date date = new Date();
        String format = FORMAT.format(date);
        return format+"发送信息："+this.message;
    }
}
