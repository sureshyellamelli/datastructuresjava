package com.skywood.skywoodexamples.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SingleElement {


    public static void main (String[] args)
    {
        int ar[] = {2, 3, 5, 4, 5, 3, 4};
       /* int n = ar.length;

        System.out.println("Element occurring once is " +
                singleItem(ar, n) + " ");*/


        Integer[] a = { 1, 2, 3, 5 };
        Integer[] b = { 6, 7, 8, 9 };
        Integer[] c = { 10, 11, 12 };


        ArrayList<Integer> listOne = new ArrayList<>(Arrays.asList(a));
        ArrayList<Integer> listTwo = new ArrayList<>(Arrays.asList(b));
        ArrayList<Integer> listThree= new ArrayList<>(Arrays.asList(c));

        listOne.addAll(listTwo);
        listOne.addAll(listThree);

    }

    private static int singleItem(int[] ar, int n){
// Do XOR of all elements and return
        int res = ar[0];
        for (int i = 1; i < n; i++)
            res = res ^ ar[i];

        return res;

    }
}
