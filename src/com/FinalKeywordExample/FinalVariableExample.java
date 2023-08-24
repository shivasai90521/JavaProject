package com.FinalKeywordExample;

public class FinalVariableExample {
    public final int a=10;
    public void display(){
        final int a=20;
        System.out.println("A ="+a);
    }

    public static void main(String[] args) {
        FinalVariableExample f=new FinalVariableExample();
        f.display();
    }
}
