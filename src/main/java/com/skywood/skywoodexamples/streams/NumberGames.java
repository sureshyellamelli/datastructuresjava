package com.skywood.skywoodexamples.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class NumberGames {
    public static void main(String[] args) {

        int[] array = {54, 23, 9, 14, 90, 57, 32, 19, 15};
        Optional<Integer> integer = secondHighestNumber(array);
        System.out.println(integer.get());

        numberStartsWith(array);


    }

    static Optional<Integer> secondHighestNumber(int[] a) {

        return Arrays.stream(a).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst();

    }

    static void numberStartsWith(int[] a) {

        List<String> collect = Arrays.stream(a).boxed().map(k -> k + "").filter(j -> j.startsWith("1")).collect(Collectors.toList());
        collect.stream().forEach(System.out::println);
    }
}
