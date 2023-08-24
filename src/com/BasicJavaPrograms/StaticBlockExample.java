package com.BasicJavaPrograms;

public class StaticBlockExample {
    int i;
    static int j;

    public static void m1(){
        j=10;
        j=40;
    }
    static {
        j=60;
        System.out.println("This is static block j: "+j);
    }

    public static void main(String[] args) {
        m1();
        StaticBlockExample sb=new StaticBlockExample();
        sb.i=23;
        System.out.println("This is non-static variable i: "+sb.i);
        System.out.println("This is value of j: "+j);
    }
}
