package com.IntroductionExample;

public class WhileEx {
    public void store(int i){
        while (i>=10){
            System.out.println("'i' value is: "+i);
            --i;
        }
        System.out.println("it is not while loop ");
        }
        public static void main(String[] args) {
        WhileEx w=new WhileEx();
        w.store(10);
    }
}
