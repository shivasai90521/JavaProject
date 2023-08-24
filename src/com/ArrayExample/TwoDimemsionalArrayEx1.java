package com.ArrayExample;

public class TwoDimemsionalArrayEx1 {
    public void test2(){
        int [][] i=new int[100][10];
        for (int j=0,x=100;j<10;j++){
            for (int k=0;k<10;k++,x+=100){
                i[j][k]=x;
            }
        }for (int j=0;j<10;j++) {
            for (int k = 0; k < 10; k++) {
                System.out.print(i[j][k] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        TwoDimemsionalArrayEx1 ex=new TwoDimemsionalArrayEx1();
        ex.test2();
    }
}
