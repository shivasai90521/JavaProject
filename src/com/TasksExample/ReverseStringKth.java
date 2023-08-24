package com.TasksExample;

import java.util.Scanner;

public class ReverseStringKth {
    public static void main(String[] args) {
        String s="Let's reverse the first kth string in given string";
        String a[]=s.split(" ");
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the index number");
        int k=in.nextInt();
        for (int i=k-1;i>=0;i--){
            System.out.print(a[i]+" ");
        }
        s=s.join(" ",a);
        System.out.println(s);
    }
}
