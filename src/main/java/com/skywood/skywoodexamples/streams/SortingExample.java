package com.skywood.skywoodexamples.streams;

import com.skywood.skywoodexamples.model.DataBase;
import com.skywood.skywoodexamples.model.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingExample {

    public static void main(String[] args) {

        List<Employee> empList = DataBase.getEmployees();

        //sorting using utility package which will persist

        Collections.sort(empList, (a,b) -> (int)(a.getSalary() - b.getSalary()));
        empList.forEach(System.out::println);

        //sort by salary
        empList.stream().sorted((e1, e2)-> (int)(e1.getSalary() - e2.getSalary())).forEach(System.out::println);

        //sort by Name
        empList.stream().sorted(Comparator.comparing(e -> e.getName())).forEach(System.out::println);

        //sort by salary using Comparator

        empList.stream().sorted(Comparator.comparing(e -> e.getSalary())).forEach(System.out::println);





    }
}
