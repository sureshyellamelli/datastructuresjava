package com.skywood.skywoodexamples.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamImplClass {
    public static void main(String[] args) {

        List<Person> personList = Arrays.asList(

                new Person("suresh", "yellamelli", "ID1"),
                new Person("sreedevi", "buma", "ID2"),
                new Person("shashank", "senapati", "ID3"),
                new Person("varlakshmi", "yellamelli", "ID6"),
                new Person("sachin", "tendulkar", "ID9")
        );


        List<Person> employeeList = Arrays.asList(

                new Person("John", "dow", "ID1"),
                new Person("srinath", "mukre", "ID2"),
                new Person("jackie", "chan", "ID3"),
                new Person("bruce", "lee", "ID6"),
                new Person("tom", "cruice", "ID9")
        );


        personList.addAll(employeeList);

        //sort the elements by lastname

        Collections.sort(personList, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));
        //print all names where the last name start with Y

        personList.stream().filter( p-> p.getLastName().startsWith("y")).collect(Collectors.toList());




    }
}
