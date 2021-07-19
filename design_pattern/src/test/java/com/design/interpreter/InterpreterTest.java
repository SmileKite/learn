package com.design.interpreter;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * 解释器测试类
 * @author lizhenyu
 * @date 2021/7/19
 */
public class InterpreterTest {
    @Test
    public void testInterpreter1() {
        String rule = "key1 > 10 && key2 < 5 || key1 > 12 && key2 < 7 || key1 > 15";
        AlertRuleInterpreter interpreter = new AlertRuleInterpreter(rule);
        Map<String, Long> stat = new HashMap<>();
        stat.put("key1", 16L);
        stat.put("key2", 10L);
        Assert.assertTrue(interpreter.interpret(stat));
    }

    @Test
    public void testInterpreter2() {
        String rule = "key1 > 10 && key2 < 5 || key1 > 12 && key2 < 7 || key1 > 15";
        AlertRuleInterpreter interpreter = new AlertRuleInterpreter(rule);
        Map<String, Long> stat = new HashMap<>();
        stat.put("key1", 13L);
        stat.put("key2", 6L);
        Assert.assertTrue(interpreter.interpret(stat));
    }

    @Test
    public void testInterpreter3() {
        String rule = "key1 > 10 && key2 < 5 || key1 > 12 && key2 < 7 || key1 > 15";
        AlertRuleInterpreter interpreter = new AlertRuleInterpreter(rule);
        Map<String, Long> stat = new HashMap<>();
        stat.put("key1", 13L);
        stat.put("key2", 8L);
        Assert.assertFalse(interpreter.interpret(stat));
    }

    @Test
    public void testInterpreter4() {
        String rule = "key1 > 10 && key2 < 5 || key1 > 12 && key2 < 7 || key1 > 15";
        AlertRuleInterpreter interpreter = new AlertRuleInterpreter(rule);
        Map<String, Long> stat = new HashMap<>();
        stat.put("key1", 11L);
        stat.put("key2", 6L);
        Assert.assertFalse(interpreter.interpret(stat));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInterpreter5() {
        String rule = "key1 > 10 key2 < 5 || key1 > 12 && key2 < 7 || key1 > 15";
        AlertRuleInterpreter interpreter = new AlertRuleInterpreter(rule);
        Map<String, Long> stat = new HashMap<>();
        stat.put("key1", 11L);
        stat.put("key2", 6L);
        Assert.assertFalse(interpreter.interpret(stat));
    }
}
