package com.design.callback;

/**
 * 回调函数接口
 * @author lizhenyu
 * @date 2021/7/3
 */
public interface ICallback {
    /**
     * 回调方法
     * @param message 接收参数
     * @return 执行结果
     */
    String callback(String message);
}
