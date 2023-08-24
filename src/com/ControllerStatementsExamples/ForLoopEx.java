package com.ControllerStatementsExamples;

public class ForLoopEx {
    public void m1() {
        {
            for (int i = 1; i <= 10; i++) {
                for (int j = 0; j <= 0; i--) {
                    System.out.println("the 'i' value is: ");
                }
            }
        }
    }

    public static void main(String[] args) {
        ForLoopEx f = new ForLoopEx();
        f.m1();
    }
}