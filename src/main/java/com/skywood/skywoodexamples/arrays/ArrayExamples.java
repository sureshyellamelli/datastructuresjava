package com.skywood.skywoodexamples.arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayExamples {

    public static void main(String[] args) {

        int test[] = new int[]{1, 2, 3, 4, 5, 6};

        String[] str = new String[]{"test", "fds", "spring", "autumn", "winter"};

        Student[] std;
        std = new Student[]{ new Student(1,"Suresh"), new Student(2, "Shashank")
        };

//reverse
        //Arrays.stream(reverseArray(test)).forEach(System.out::print);
//find the 3 largest
        int arr[] = {10, 4, 3, 50, 23, 90};
        //Output: 90, 50, 23
        findThreeSmallest(arr);



    }

    static int[] reverseArray(int i[]){

        int [] result = new int[i.length];
        
        for(int k=0,j=i.length-1 ; k<  i.length ; k++, j--){

            result[k] = i[j];
        }
        return result;
    }

    static void findThreeLargest(int arr[]){

        int first,second,third ;

         third = first = second = Integer.MIN_VALUE;

         for(int i=0 ; i<arr.length; i++){

             if(arr[i] > first){
                 third = second;
                 second = first;
                 first = arr[i];
             }else if(arr[i] > second){
                 third = second;
                 second = arr[i];
             }else {
                 third = arr[i];
             }

         }

         System.out.println("First: " +first +"Second : " +second+ "third : "+third);

    }

    static void findThreeSmallest(int arr[]){

        int first,second,third ;

        third = first = second = Integer.MAX_VALUE;

        for(int i=0 ; i<arr.length; i++){

            if(arr[i] < first){
                third = second;
                second = first;
                first = arr[i];
            }else if(arr[i] < second){
                third = second;
                second = arr[i];
            }else {
                third = arr[i];
            }

        }

        System.out.println("First: " +first +"Second : " +second+ "third : "+third);

    }
}
