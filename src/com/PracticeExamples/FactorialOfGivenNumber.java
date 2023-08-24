package com.PracticeExamples;

import java.util.Scanner;

public class FactorialOfGivenNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int a=sc.nextInt();
        int i=1,fact=1;
        while (i<=a){
            fact=fact*i;
            i++;
        }
        System.out.println("The factorial of: "+fact);
    }
}
