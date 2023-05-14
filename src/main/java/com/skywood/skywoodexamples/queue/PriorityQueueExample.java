package com.skywood.skywoodexamples.queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueExample {

    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((x, y) -> Integer.compare(y, x));
        //add element to the PriorityQueue

        PriorityQueue<String> spq = new PriorityQueue<>((s1,s2) ->  s2.compareTo(s1));


        spq.add("z");

        spq.add("a");
        spq.add("c");

        String val = null;
        while( (val = spq.poll()) != null) {
            System.out.print(val + " ");
        }
        pq.add(8);
        pq.add(6);
        pq.add(4);
        pq.add(2);
        pq.add(12);
        pq.add(10);
        //display the min PriorityQueue
     /*   System.out.println("The min Priority Queue (natural ordering) contents:");
        Integer val = null;
        while( (val = pq.poll()) != null) {
            System.out.print(val + " ");
        }

      */

    }
}
