package com.demo.model;

public enum Grade {

    DISTINCTION(80, 100),
    FIRST(65, 79),
    SECOND(50, 64),
    PASS(40, 49),
    FAIL(0, 39);

    private int min;
    private int max;

    Grade(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }
}