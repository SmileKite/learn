package com.design.interpreter.expression.impl;

import com.design.interpreter.expression.Expression;

import java.util.Map;

/**
 * <解释器
 * @author lizhenyu
 * @date 2021/7/19
 */
public class LessExpression implements Expression {
    private String key;
    private long value;
    public LessExpression(String expression) {
        // <号标识
        String less = "<";
        // 最小表达式包含元素个数
        int min = 3;
        String[] elements = expression.trim().split("\\s+");
        if (elements.length != min || !less.equals(elements[1].trim())) {
            throw new IllegalArgumentException("参数无效");
        }
        this.key = elements[0].trim();
        this.value = Long.parseLong(elements[2].trim());
    }
    @Override
    public boolean interpret(Map<String, Long> stat) {
        if (!stat.containsKey(key)) {
            return false;
        }
        Long statValue = stat.get(key);
        return statValue < value;
    }
}
