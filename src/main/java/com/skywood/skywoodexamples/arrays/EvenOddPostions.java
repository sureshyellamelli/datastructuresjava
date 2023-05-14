package com.skywood.skywoodexamples.arrays;

public class EvenOddPostions {

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        //Output: arr[] = {7, 1, 6, 2, 5, 3, 4}

        int len = arr.length;
        int p1_min = 0;
        int p2_max = len-1;

        int result[] = new int[len];
        for(int i=0 ; i< arr.length ; i++){
            if(i % 2 == 0) {
                result[i] = arr[p2_max];
                p2_max--;
            }else{
                result[i] = arr[p1_min];
                p1_min++;
            }
        }

        for(int k : result){
            System.out.print(k);
        }

    }
}
