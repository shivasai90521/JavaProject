package com.PracticeExamples;

import java.util.Scanner;

public class Print3NumbersInAscendingOrder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three numbers ");
       int a=sc.nextInt();
       int b=sc.nextInt();
       int c=sc.nextInt();
       if(a<b && a<c)
       {
           if (b<c)
           {
               System.out.println(a+" "+b+" "+c);
           }else {
               System.out.println(a+" "+c+" "+b);
           }
           }
       else if (b<a && b<c){
           if (a<c){
               System.out.println(b+" "+a+" "+c);
           }else {
               System.out.println(b+" "+c+" "+a);
           }
       } else if (c<a && c<b) {
           if (b<a){
               System.out.println(c+" "+b+" "+a);
           }else {
               System.out.println(c+" "+a+" "+b);
           }
       }
    }
}
