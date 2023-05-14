package com.skywood.skywoodexamples.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AverageOfMergedArray {

    public static void main(String[] args) {

        Integer [] i ={1,3,6,9};
        Integer []j = {2,4,7,8,10};

        ArrayList<Integer> ints = new ArrayList<>( Arrays.asList(i));
        ArrayList<Integer> ints1 = new ArrayList(Arrays.asList(j));
        boolean b = ints.addAll(ints1);


        Collections.sort(ints);
        ints.stream().forEach(System.out::print);
        int mid  =  ints.size() % 2 == 0 ? ints.size()/2 : ints.size()/2 +1;





    }
}
