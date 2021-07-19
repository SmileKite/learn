package com.design.interpreter.expression;

import java.util.Map;

/**
 * 解释器接口
 * @author lizhenyu
 * @date 2021/7/19
 */
public interface Expression {
    /**
     * 报警检测
     * @param stat 报警检测数据
     * @return 是否报警
     */
    boolean interpret(Map<String, Long> stat);
}
