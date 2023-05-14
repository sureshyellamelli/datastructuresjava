package com.skywood.skywoodexamples;

public class Book {
    int tickets = 1;
    // method to book movie ticket
    void Book(int request, String name)
    {
        // logic to book ticket
        if (tickets >= request) {
            System.out.println(name + " booked " + request
                    + " ticket.");
            tickets = tickets - 1;
            System.out.println("Tickets left: " + tickets);
        }
        else {
            System.out.println("No tickets are available.");
        }
    }
}
