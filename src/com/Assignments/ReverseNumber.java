package com.Assignments;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        int num=1234;
        int rev=0;
        System.out.println("Number is: "+num);
        while (num!=0){
            rev=rev*10+num%10;
            num=num/10;
        }
        System.out.println("Reverse number is :"+rev);
    }

}