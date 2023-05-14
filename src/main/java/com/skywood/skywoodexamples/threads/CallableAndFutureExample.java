package com.skywood.skywoodexamples.threads;

import java.util.concurrent.*;

/**
 * CallableAndFutureExample.java
 * This program demonstrates how to execute value-returning tasks
 * and wait for the results available.
 * @author www.codejava.net
 */
public class CallableAndFutureExample {

    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        Future<Integer> sumResult = pool.submit(new SumCalculator(100000));
        Future<Integer> factorialResult = pool.submit(new FactorialCalculator(8));
        try {
            Integer sumValue = sumResult.get();
            System.out.println("Sum Value = " + Runtime.getRuntime().availableProcessors());
            Integer factorialValue = factorialResult.get();
            System.out.println("Factorial Value = " + factorialValue);
        } catch (InterruptedException | ExecutionException ex) {
            ex.printStackTrace();
        }
        pool.shutdown();
    }

    public static ExecutorService createFixedThreadPool() {
        return Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
    }
}
