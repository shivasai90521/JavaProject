package com.PracticeExamples;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of abc ");
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();

        double s=((a+b+c)/2);
       // double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        double area=Math.pow(a,b);
        System.out.println("the area of a triangle is:"+area);
    }
}