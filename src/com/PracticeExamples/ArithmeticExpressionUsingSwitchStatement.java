package com.PracticeExamples;

import java.util.Scanner;

public class ArithmeticExpressionUsingSwitchStatement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter numbers ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Enter choice");
        int c=sc.nextInt();
        switch (c){
            case 1:
                System.out.println(a+b);
                break;
            case 2:
                System.out.println(a-b);
                break;
            case 3:
                System.out.println(a*b);
                break;
            case 4:
                System.out.println(a/b);
                break;
            case 5:
                System.out.println(a%b);
                break;
            default:
                System.out.println("Invalid number Again check the number");
                break;
        }
    }
}
