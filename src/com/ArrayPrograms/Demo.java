package com.ArrayPrograms;

public class Demo {
    public static void main(String[] args) {
        /* Array Declaration */
        int [] a;
        /* Array creation */
        a=new int[3];
        /* Printing Array Elements */
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);

        System.out.println("------------------");

        /* Array Initialization */
        a[1]=20;
        a[2]=40;
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
    }
}

