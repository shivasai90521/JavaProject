package com.LoopsExample;

import com.IntroductionExample.WhileEx;

public class WhileExample {
    public void display(int i){
        while (i<=10){
            System.out.println("The 'i' value is: "+i);
            i++;
        }
        System.out.println("It is not While Loop");
    }
    public static void main(String[] args) {
        WhileExample ex=new WhileExample();
        ex.display(11);
    }
}
