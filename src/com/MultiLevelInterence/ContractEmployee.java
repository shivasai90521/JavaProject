package com.MultiLevelInterence;

public class ContractEmployee extends Employee{
    float salary;
    String cperiod;

    public String getCperiod() {

        return cperiod;
    }

    public ContractEmployee setCperiod(String cperiod) {
        this.cperiod = cperiod;
        return this;
    }

    public float getSalary() {
        return salary;
    }

    public ContractEmployee setSalary(float salary) {
        this.salary = salary;
        return this;
    }
}

