package com.BasicJavaPrograms;

public class ReverseStartsEx {
    public void test(){
        for (int i=1;i<15;i++){
            for (int j=15;j>i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ReverseStartsEx ex1=new ReverseStartsEx();
        ex1.test();
    }
}
