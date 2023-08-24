package com.BasicJavaPrograms;

public class Calculator {
    int a;
    int b;
    public void swap(){
        int temp=a;
        a=b;
        b=temp;
        System.out.println("After swaping A: value: "+a+" B:value: "+b);
    }

    public static void main(String[] args) {
        Calculator c=new Calculator();
        c.a=10;
        c.b=90;
        c.swap();
    }
}

