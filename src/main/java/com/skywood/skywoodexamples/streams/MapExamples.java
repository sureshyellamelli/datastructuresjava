package com.skywood.skywoodexamples.streams;

import com.skywood.skywoodexamples.model.Employee;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class MapExamples {


    public static void main(String[] args) {
        Map<Integer, Employee> empMap = new HashMap<>();
        empMap.put(1, new Employee(100, "Suresh", "IT", 600));
        empMap.put(2, new Employee(200, "Kishore", "Marketing", 500));
        empMap.put(3, new Employee(300, "prakash", "Finance", 540));
        empMap.put(4, new Employee(400, "Jaggu", "Admin", 800));
        empMap.put(5, new Employee(500, "Anil", "Inventory", 490));
        empMap.put(6, new Employee(600, "sachin", "PR", 350));

        //empMap.putAll();

        empMap.entrySet().stream().sorted((a,b) -> Math.toIntExact(a.getValue().getSalary() - b.getValue().getSalary()))
                .forEach(System.out::println);

        empMap.entrySet().stream().sorted(Comparator.comparing(a -> a.getValue().getSalary())).forEach(System.out::println);



    }
}
