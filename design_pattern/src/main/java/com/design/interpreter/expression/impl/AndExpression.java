package com.design.interpreter.expression.impl;

import com.design.interpreter.expression.Expression;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * &&解释器
 * @author lizhenyu
 * @date 2021/7/19
 */
public class AndExpression implements Expression {
    private List<Expression> expressions = new ArrayList<>();
    public AndExpression(String expression) {
        String[] compareExpressions = expression.split("&&");
        for (String compareExpression : compareExpressions) {
            if (compareExpression.contains(">")) {
                expressions.add(new GreaterExpression(compareExpression));
            } else if (compareExpression.contains("<")) {
                expressions.add(new LessExpression(compareExpression));
            } else if (compareExpression.contains("==")) {
                expressions.add(new EqualsExpression(compareExpression));
            } else {
                throw new IllegalArgumentException("参数无效");
            }
        }
    }
    @Override
    public boolean interpret(Map<String, Long> stat) {
        for (Expression expression : expressions) {
            if (!expression.interpret(stat)) {
                return false;
            }
        }
        return true;
    }
}
