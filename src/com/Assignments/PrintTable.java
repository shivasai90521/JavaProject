package com.Assignments;

import java.util.Scanner;

public class PrintTable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the table");
        int t=sc.nextInt();
        for (int i=1;i<=10;i++){
            System.out.println(t+"*"+i+"="+(t*i));
        }
    }
}
