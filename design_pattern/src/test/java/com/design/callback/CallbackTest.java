package com.design.callback;

import org.junit.Test;

/**
 * 回调函数测试
 * @author lizhenyu
 * @date 2021/7/3
 */
public class CallbackTest {

    /**
     * 回调函数测试
     */
    @Test
    public void TestCallback() {
        Target target = new Target();
        target.action(new ICallback() {
            @Override
            public String callback(String message) {
                System.out.println("回调函数执行："+message);
                return "执行成功";
            }
        });
    }
}
