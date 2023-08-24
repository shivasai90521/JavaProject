package com.BasicJavaPrograms;

public class Example {
    int a;
    int b;
    public Example(int i,int j){
        a=i;
        b=j;
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        Example ex=new Example(10,50);
    }
}
