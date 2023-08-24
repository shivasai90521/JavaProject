package com.BasicJavaPrograms;

public class StaticVariableExample {
    int i;
    static int j;

    public static void main(String[] args) {
        StaticVariableExample.j=20;
        StaticVariableExample ex=new StaticVariableExample();
        ex.i=30;
        ex.j=40;
        System.out.println("The value of i: "+ex.i);
        System.out.println("The static value of j: "+j);
    }
}
