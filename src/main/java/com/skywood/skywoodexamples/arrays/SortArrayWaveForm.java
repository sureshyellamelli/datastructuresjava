package com.skywood.skywoodexamples.arrays;

import java.util.Arrays;
import java.util.Collections;

public class SortArrayWaveForm {

    public static void main(String[] args) {


        int arr[] = {10, 5, 6, 3, 2, 20, 100, 80};
        //  Output: arr[] = {10, 5, 6, 2, 20, 3, 100, 80}

        Arrays.sort(arr);


        for (int index = 0; index < arr.length - 1; index += 2) {

            if (arr[index] < arr[index + 1]) {
                int temp = arr[index];
                arr[index] = arr[index + 1];
                arr[index + 1] = temp;
            }
        }

        for (int a : arr) {
            System.out.print(a + ",");
        }
    }
}
