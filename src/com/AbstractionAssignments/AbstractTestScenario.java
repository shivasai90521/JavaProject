package com.AbstractionAssignments;

public class AbstractTestScenario extends AbstractionThreeExample{
    @Override
    public void m4() {
        System.out.println("This is m4");
    }

    @Override
    public void m5() {
        System.out.println("This is m5");
    }

    public static void main(String[] args) {
        AbstractTestScenario abs=new AbstractTestScenario();
        abs.m2();
        abs.m3();
        abs.m4();
        abs.m5();
    }
}
