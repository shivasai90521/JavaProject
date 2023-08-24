package com.revisionExamples;

import java.util.Scanner;

public class SwitchEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("pls enter value");
        int a= sc.nextInt();
        switch (a){
            case 1:
            case 2:
            case 3:
                System.out.println("hello");
                break;
            case 4:
                System.out.println("welcome");
                break;
            default:
                System.out.println("invalid number");
                break;
        }
    }
}
