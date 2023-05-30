package com.workerssystem.workerssystem;

public class Employee {

    private static int nextId = 1;

    private int id;
    private String firstName;
    private String lastName;
    private String position;
    private double salary;

    public Employee() {
        this.id = nextId++;
    }

    public int getId() {
        return id;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
