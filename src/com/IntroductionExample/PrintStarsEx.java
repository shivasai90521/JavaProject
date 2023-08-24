package com.IntroductionExample;

public class PrintStarsEx {
    public void test(){
        for (int i=1;i<10;i++){
            for (int j=10;j>i;j--){
                System.out.print("*");
            }
            System.out.println( );
        }
    }

    public static void main(String[] args) {
        PrintStarsEx ex=new PrintStarsEx();
        ex.test();
    }
}
