package com.design.interpreter.expression.impl;

import com.design.interpreter.expression.Expression;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * ||解释器
 * @author lizhenyu
 * @date 2021/7/19
 */
public class OrExpression implements Expression {
    private List<Expression> expressions = new ArrayList<>();
    public OrExpression(String expression) {
        String[] andExpressions = expression.split("\\|\\|");
        for (String andExpression : andExpressions) {
            expressions.add(new AndExpression(andExpression));
        }
    }
    @Override
    public boolean interpret(Map<String, Long> stat) {
        for (Expression expression : expressions) {
            if (expression.interpret(stat)) {
                return true;
            }
        }
        return false;
    }
}
