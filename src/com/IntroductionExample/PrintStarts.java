package com.IntroductionExample;

public class PrintStarts {

    public void test(){
        for (int i=0;i<6;i++){
            for (int j=6;j>i;j--){
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
//    public void test1(){
//        for (int i=1;i>6;i++){
//            for (int j=6;j>i;j--){
//                System.out.print("*");
//            }
//            System.out.println("");
//        }
//    }
    public void test2(){
        for (int i=2;i<6;i++){
            for (int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }


    public static void main(String[] args) {
        PrintStarts p=new PrintStarts();
        p.test();
        //p.test1();
        p.test2();
    }
}
