package com.BasicForLoopExample;

public class PrintReverseStartsEx {
    public void display(){
        for (int i=1;i<10;i++){
            for (int j=10;j>i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        PrintReverseStartsEx ex1=new PrintReverseStartsEx();
        ex1.display();
    }
}
