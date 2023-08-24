package com.PracticeExamples;

import java.util.Scanner;

public class PrimeNumbersUpNthNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Nth number");
        int n=sc.nextInt();
        int f = 0;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                if (i%j==0){
                    f++;
                }
            }
            if (f==2){
                System.out.println(i+" is a prime number");
            }f=0;
        }
    }
}