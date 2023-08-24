package com.IntroductionExample;

public class ArugmentMethod {
    public void add(int a,int b){
        int x=a+b;
        System.out.println("To addition of two numbers: "+x);
    }
    public void sub(int a,int b){
        int x=a-b;
        System.out.println("To subtraction of two numbers: "+x);
    }
    public static void main(String[] args) {
    ArugmentMethod a=new ArugmentMethod();
    a.add(20,45);
    a.sub(78,45);
    }
}
