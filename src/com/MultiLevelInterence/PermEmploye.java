package com.MultiLevelInterence;

public class PermEmploye extends ContractEmployee{
    public float getBonus() {
        return bonus;
    }

    public int getLeaves() {
        return leaves;
    }

    public PermEmploye setLeaves(int leaves) {
        this.leaves = leaves;
        return this;
    }

    public PermEmploye setBonus(float bonus) {
        this.bonus = bonus;
        return this;
    }

    float bonus;
    int leaves;

    public static void main(String[] args) {
        PermEmploye p =new PermEmploye();
        p.setId(123);
        p.setBonus(4000);
        p.setLeaves(2);
        p.setCperiod("One Year");
        p.setName("Shiva");
        p.setSalary(32328);
        System.out.println("Employee id: "+p.getId());
        System.out.println("Employee name: "+p.getName());
        System.out.println("Employee salary: "+p.getSalary());
        System.out.println("Employee bonus: "+p.getBonus());
        System.out.println("Employee leaves: "+p.getLeaves());
        System.out.println("Employee Contract period: "+p.getCperiod());

    }
    }

