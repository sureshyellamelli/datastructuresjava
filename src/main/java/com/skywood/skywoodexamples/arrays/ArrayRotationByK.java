package com.skywood.skywoodexamples.arrays;


import java.util.Arrays;

public class ArrayRotationByK {

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6, 7}, d = 3;
//        Output:  4, 5, 6, 7, 1, 2,3
   //    int arr[] = {1, 2, 3, 4, 5, 6, 7};
        leftRotate(arr, d); // Rotate array by d
        Arrays.stream(arr).forEach(System.out::print);
    }

    private static void leftRotate(int[] arr, int d) {

        if (d == 0)
            return;
        int n = arr.length;
        reverseArrayByK(arr, 0, d - 1);
        reverseArrayByK(arr, d, n - 1);
        reverseArrayByK(arr, 0, n - 1);
    }
    private static void reverseArrayByK(int[] arr, int start, int end) {

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
