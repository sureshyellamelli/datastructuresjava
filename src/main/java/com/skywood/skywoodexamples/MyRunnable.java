package com.skywood.skywoodexamples;

import java.util.concurrent.Callable;

public class MyRunnable implements Callable, Runnable {
    private final long countUntil;

    MyRunnable(long countUntil) {
        this.countUntil = countUntil;
    }

    @Override
    public void run() {
        long sum = 0;
        for (long i = 1; i < countUntil; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    @Override
    public Object call() throws Exception {
        return null;
    }
}
