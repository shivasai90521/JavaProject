package com.BasicJavaPrograms;

public class ReverseStartsEx1 {
    public void test(){
        for (int i=1;i<5;i++){
            for (int j=5;j>i;j--){
                System.out.print("*");
            }
            System.out.println();
        }for (int i=2;i<5;i++){
            for (int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ReverseStartsEx1 ex=new ReverseStartsEx1();
        ex.test();
    }
}
