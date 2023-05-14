package com.skywood.skywoodexamples.interfaces;

import java.util.HashMap;

import java.util.*;

public class MyInterfaceImpl implements MyInterface{

    public static void main(String[] args) {

        Map <String, Integer> map = new HashMap<>();

        map.put("Suresh",1);
        map.put("Kishore",2);

      map.entrySet().forEach(m -> System.out.print(m));

    }

    @Override
    public void myMethod() {

    }

    @Override
    public void m1() {
        MyInterface.super.m1();
    }


}
