package com.skywood.skywoodexamples.arrays;


import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter

public class Student {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return stdNumber.equals(student.stdNumber) && stdName.equals(student.stdName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stdNumber, stdName);
    }

    public Student(Integer stdNumber, String stdName) {
        this.stdNumber = stdNumber;
        this.stdName = stdName;
    }

    private Integer stdNumber;
    private String stdName;
}
