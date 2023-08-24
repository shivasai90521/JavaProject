package com.BasicForLoopExample;

public class PrintStartsReversExample {
    public void display(){
        for (int i=0;i<6;i++){
            for (int j=6;j>i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }public void display1(){
        for (int i=1;i<6;i++){
            for (int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        PrintStartsReversExample p=new PrintStartsReversExample();
        p.display();
        p.display1();
    }
}
