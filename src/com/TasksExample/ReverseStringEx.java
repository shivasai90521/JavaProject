package com.TasksExample;

public class ReverseStringEx {
    public static void main(String[] args) {
       String str = "hello world" , rev="";
        char ch;
        System.out.print("Original Word: ");
        System.out.println("hello world");

        for (int i=0;i<str.length();i++)
        {
            ch = str.charAt(i);
            rev = ch + rev;
        }
            System.out.println("Reversed word: "+ rev);

        }
}
