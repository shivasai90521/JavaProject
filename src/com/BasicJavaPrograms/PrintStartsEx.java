package com.BasicJavaPrograms;

public class PrintStartsEx {
    public void test(){
        for (int i=1;i<10;i++){
            for (int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        PrintStartsEx ex=new PrintStartsEx();
        ex.test();
    }
}
