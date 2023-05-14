package com.skywood.skywoodexamples.java8features;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.*;
import java.util.stream.Stream;

public class SecondLargest {

    public static void main(String[] args) {
        int arr[] = {12, 35, 1, 2, 3, 12, 2, 10, 34, 1};

        Arrays.stream(arr).distinct().sorted().skip(1).limit(1).forEach(System.out::println);

        //swap zeros
        int[] a = {5, 6, 0, 4, 6, 0, 9, 0, 8};

    }
}
