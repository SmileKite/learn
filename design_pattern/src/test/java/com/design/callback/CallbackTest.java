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
        CallbackDemo.CallbackClass callbackClass = new CallbackDemo.CallbackClass();
        callbackClass.action((a)->{
            System.out.println(a+"执行了回调");
            return "回调执行成功！";
        });
    }
}
