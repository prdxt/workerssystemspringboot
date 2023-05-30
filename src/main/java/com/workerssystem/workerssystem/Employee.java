package com.workerssystem.workerssystem;

public class Employee {

    private static int nextId = 1;

    private int id;
    private String firstName;
    private String lastName;
    private String position;
    private double salary;

    public Employee(String firstName, String lastName, String position, double salary) {
        this.id = nextId++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.salary = salary;
    }

}
