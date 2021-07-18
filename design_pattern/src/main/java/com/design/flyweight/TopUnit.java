package com.design.flyweight;

/**
 * 顶层单元（象棋棋子）
 * @author lizhenyu
 * @date 2021/6/27
 */
public class TopUnit {
    /** 棋子基础信息 */
    private BaseUnit baseUnit;
    /** 棋子横坐标 */
    private int pointX;
    /** 棋子纵坐标 */
    private int pointY;
    public TopUnit(BaseUnit baseUnit, int pointX, int pointY) {
        this.baseUnit = baseUnit;
        this.pointX = pointX;
        this.pointY = pointY;
    }

    /**
     * 棋子移动
     * @param pointX 横坐标
     * @param pointY 纵坐标
     */
    public void move(int pointX, int pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }
}
