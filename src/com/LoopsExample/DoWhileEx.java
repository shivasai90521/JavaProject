package com.LoopsExample;

public class DoWhileEx {
    public void m1(int i){
        do{
            System.out.println("The 'i' value is :"+i);
            i--;
        }while (i>=10);
        System.out.println("Welcome while loop");
        }
        public static void main(String[] args) {
        DoWhileEx d=new DoWhileEx();
        d.m1(12);
    }
}
