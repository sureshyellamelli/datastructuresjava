package com.skywood.skywoodexamples.arrays;

public class PeakNotSmallerThanNeibhours {

    public static void main(String[] args) {
        int array[] = {10, 20, 15, 2, 23, 90, 67};

        int peak = Integer.MIN_VALUE;

        for (int i = 0; i < array.length - 2; i++) {

            if (array[i + 1] > array[i + 2] && array[i] < array[i + 1]) {

                if (peak < array[i + 1])
                    peak = array[i + 1];
            }
        }

        System.out.print("peak :"+peak);


    }
}
