package com.IntroductionExample;

public class IfExample1 {
    public void check(int age){
        if (age<=18){
            System.out.println("Eligible for voting");

        }else {
            System.out.println("not eligible for voting");
        }
    }

    public static void main(String[] args) {
        IfExample1 i=new IfExample1();
        i.check(20);
    }
}
