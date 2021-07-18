package com.design.bridge.message.impl;

import com.design.bridge.message.MessageProcess;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * 信息加密处理器
 * @author lizhenyu
 * @date 2021/6/27
 */
public class EncryptionMessageProcess extends MessageProcess {
    public EncryptionMessageProcess(String message) {
        super(message);
    }
    @Override
    public String getMessage() {
        String message = this.message;
        try {
            byte[] md5s = MessageDigest.getInstance("md5").digest(message.getBytes(StandardCharsets.UTF_8));
            message = new String(md5s, StandardCharsets.UTF_8);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return message;
    }
}
