package com.skywood.skywoodexamples.exceptionhandling;

import java.net.http.HttpClient;
import java.util.Scanner;
public class ExceptionExamples {

        public static void main(String[] args)
        {
        /* After completion of try block,
        the Scanner object would be auto closed
        as Scanner class implements AutoCloseable
        interface. */
            try(Scanner sc = new Scanner(System.in))
            {
                System.out.println(" try without catch/finally block ");
            }
        }

}
