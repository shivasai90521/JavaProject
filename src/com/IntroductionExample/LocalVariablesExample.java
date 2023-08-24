package com.IntroductionExample;

public class LocalVariablesExample {
    public void marks(){
        int a=20;    //local variable
        int b=30;
        int c=a+b;
        System.out.println("The adding two numbers: "+c);
    }

    public static void main(String[] args) {
        LocalVariablesExample l=new LocalVariablesExample();
        l.marks();
    }
}
