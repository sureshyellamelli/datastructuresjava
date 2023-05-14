package com.skywood.skywoodexamples.streams;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringCalculations {

    public static void main(String[] args) {

        //Map<String, Integer> helloWorld = numberOfCharacterInString("HHeeleoWorld");
       // helloWorld.entrySet().parallelStream().forEach((Consumer<? super Map.Entry<String, Integer>>) System.out::println);

       // List<String> collect = helloWorld.entrySet().stream().filter(a -> a.getValue() > 1).map(a -> a.getKey()).collect(Collectors.toList());

        Map<String, Long> helloWorldusing8 = numberOfCharacterUsingJava8("HHeeleoWorld");

        String key = helloWorldusing8.entrySet().stream().filter(a -> a.getValue() == 1).findFirst().get().getKey();


        System.out.println(helloWorldusing8);

    }

    static Map<String, Integer> numberOfCharacterInString(String str) {

        Map<String, Integer> list = new HashMap<>();

        String[] split = str.split("");
        for (String c : split) {
            if (list.containsKey(c)) {

                Integer i = list.get(c);
                list.put(c, i + 1);

            } else {
                list.put(c, 1);
            }

        }
        return list;
    }

    static Map<String, Long> numberOfCharacterUsingJava8(String str) {

        Map<String, Long> collect = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        return collect;
    }
}
