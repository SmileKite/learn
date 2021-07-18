package com.design.callback;

/**
 * 目标类
 * @author lizhenyu
 * @date 2021/7/3
 */
public class Target {
    /**
     * 目标类的方法
     * @param callback 回调函数
     */
    public void action(ICallback callback) {
        System.out.println("执行B的action业务逻辑");
        String result = callback.callback("目标类得到的结果");
        System.out.println(result);
    }

}
