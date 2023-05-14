package com.skywood.skywoodexamples.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadsWithCallable {
    // Driver method


    Callable callable1 = new Callable<String>() {
        @Override
        public String call() {
        m1();
            return "1";
        }
    };
    Callable callable2 = new Callable<String>() {
        @Override
        public String call() {
            m2();
            return "2";
        }
    };
    Callable callable3 = new Callable<String>() {
        @Override
        public String call() {
            m3();
            return "3";
        }
    };
    private static void m1(){
        System.out.println("In M1 is running...");
    }
    public  void m2(){
        System.out.println("In M2 is running...");
    }
    public String m3() {
        System.out.println("In M3 is running...");
        return "Hello";
    }

    public static void main(String[] args) throws Exception {
        ThreadsWithCallable threadsWithCallable = new ThreadsWithCallable();
        List<Callable<String>> list = new ArrayList();
        System.out.println(threadsWithCallable.callable1.call());
        list.add(threadsWithCallable.callable1);
        list.add(threadsWithCallable.callable2);
        list.add(threadsWithCallable.callable3);

        ExecutorService service = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        service.invokeAll(list);


    }

}
