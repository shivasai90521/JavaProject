package com.revisionExamples;

import java.util.Scanner;

public class ElseIf {
    int marks;

    public void Store() {

        Scanner sc = new Scanner(System.in);
        System.out.println("pls enter marks");
       marks= sc.nextInt();
        if (marks >= 90 && marks <= 100) {
            System.out.println("Grade A");
        } else if (marks >= 80 && marks < 90) {
            System.out.println("grade B");
        } else if (marks >= 70 && marks < 80) {
            System.out.println("grade C");
        } else if (marks >= 45 && marks < 70) {
            System.out.println("grade d");
        } else
            System.out.println("fail");
    }

    public static void main(String[] args) {
        ElseIf e=new ElseIf();
        e.Store();

    }
}