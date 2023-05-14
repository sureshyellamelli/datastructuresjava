package com.skywood.skywoodexamples.interfaces;

public interface MyInterface {

    void myMethod();

    default void m1() {

    }

    public static void m2() {

    }

    private void m3() {

    }

    private static void m4() {

    }
}
