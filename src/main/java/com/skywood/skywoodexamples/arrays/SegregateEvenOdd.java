package com.skywood.skywoodexamples.arrays;

public class SegregateEvenOdd {

    public static void main(String[] args) {

        int arr[] = {1, 3, 2, 4, 7, 6, 9, 10};
       // Output: 2 6 5 3 1 9 7 11

        int len = arr.length;
        int p1=0;
        int p2=len-1;

        int result [] = new int[len];

        for(int i=0 ;i<len ;i++){

            if(arr[i] %2 == 0){

                result[p1] = arr[i];
                p1++;
            }else{
                result[p2] = arr[i];
                p2--;
            }
        }
        for(int k : result){
            System.out.print(k +" ");
        }

    }
}
