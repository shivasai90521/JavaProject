package com.BasicJavaPrograms;

public class WordsPatteran {

    public static void main(String[] args) {
        int a='A';
        for (int i=0;i<5;i++){
            for (int j=0;j<i;j++){
                System.out.print((char)a++);
            }
            System.out.println();
            a='A';
        }
    }
}
