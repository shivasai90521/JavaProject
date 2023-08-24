package com.ioExample;

public class Employee {
    private int id;

    public int getId() {
        return id;
    }

    public Employee setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Employee setName(String name) {
        this.name = name;
        return this;
    }

    public double getSalary() {
        return salary;
    }

    public Employee setSalary(double salary) {
        this.salary = salary;
        return this;
    }

    public long getMobile() {
        return mobile;
    }

    public Employee setMobile(long mobile) {
        this.mobile = mobile;
        return this;
    }

    private String name;
    private double salary;
    private long mobile;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", mobile=" + mobile +
                '}';
    }
}
