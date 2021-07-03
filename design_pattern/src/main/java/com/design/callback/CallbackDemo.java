package com.design.callback;

/**
 * 回调函数
 * @author lizhenyu
 * @date 2021/7/3
 */
public class CallbackDemo {

    interface ICallback {
        /** 回调方法 */
        String callback(String message);
    }

    static class CallbackClass {
        public void action(ICallback callback) {
            System.out.println("执行B的action业务逻辑");
            String result = callback.callback("B.action()");
            System.out.println(result);
        }
    }

}
