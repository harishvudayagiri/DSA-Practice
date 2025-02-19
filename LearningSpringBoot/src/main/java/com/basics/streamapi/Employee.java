package com.basics.streamapi;

import lombok.Data;

import java.util.List;

@Data
public class Employee {

    private String firstName;
    private String lastName;
    private double salary;
    private List projects;

    public Employee(String firstName, String lastName, double salary, List projects) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.projects = projects;
    }

    public Employee() {
    }
}
