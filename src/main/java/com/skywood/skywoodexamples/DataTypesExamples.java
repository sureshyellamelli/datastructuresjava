package com.skywood.skywoodexamples;

import java.util.Scanner;

public class DataTypesExamples {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

//        String s = sc.nextLine();
//        String s1 = s.split(";")[0];
//        String s2 = s.split(";")[1];
//
//        float f = Float.parseFloat(s2)-Float.parseFloat(s1);
//
//        System.out.println("F : "+f);

        char [] c = new char[128];

        // Caps
         for(int i =65;i< 91; i++){
             c[i] =  (char)i;
         }

        System.out.print(c);
         //small
        for(int i =97;i< 123; i++){
            c[i] =  (char)i;
        }

        System.out.print(c);




    }
}
