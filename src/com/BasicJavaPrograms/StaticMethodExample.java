package com.BasicJavaPrograms;

public class StaticMethodExample {
    int i;  //instance variable
    static int j;  //static variable
    public static void m1(){
        j=30;
        j=90;
        j=102;
    }

    public static void main(String[] args) {
        System.out.println("This is static method j: "+j);
        m1();
        System.out.println("This is static method j: "+j);

        StaticMethodExample ex=new StaticMethodExample();
        StaticMethodExample ex1=new StaticMethodExample();
        ex1.i=50;
        System.out.println("The value of i: "+ex.i);//0
        System.out.println("The value of j: "+j);
        System.out.println("The value of j: "+j);
        System.out.println("The value of i: "+ex1.i);//50


    }
}
