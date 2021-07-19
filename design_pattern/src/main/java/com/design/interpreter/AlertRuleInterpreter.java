package com.design.interpreter;

import com.design.interpreter.expression.Expression;
import com.design.interpreter.expression.impl.OrExpression;

import java.util.Map;

/**
 * 报警规则解释器
 * 假设报警规则只有&& || > < ==这几个比较符，且优先级> < ==大于&&大于||，表达式元素用空格分割
 * @author lizhenyu
 * @date 2021/7/19
 */
public class AlertRuleInterpreter {
    private Expression expression;
    public AlertRuleInterpreter(String expression) {
        this.expression = new OrExpression(expression);
    }

    /**
     * 判断是否达到报警阈值
     * @param stat 参数
     * @return true-报警
     */
    public boolean interpret(Map<String, Long> stat) {
        return expression.interpret(stat);
    }
}
