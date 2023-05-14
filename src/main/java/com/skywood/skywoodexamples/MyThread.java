package com.skywood.skywoodexamples;

import com.skywood.skywoodexamples.Book;

class MyThread extends Thread {
    Book obj;
    int n;
    String name;
    MyThread(Book obj, String name, int n)
    {
        this.obj = obj;
        this.n = n;
        this.name = name;
    }
    // runs threads
    public void run() { obj.Book(n, name); }
}