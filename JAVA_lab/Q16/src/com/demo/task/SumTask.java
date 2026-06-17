package com.demo.task;

import java.util.concurrent.Callable;

public class SumTask implements Callable<Integer> {

    private int a, b, c;

    public SumTask(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public Integer call() {
        return a + b + c;
    }
}