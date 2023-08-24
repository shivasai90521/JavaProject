package com.ArrayExample;

public class TwoDimensionalArrayEx{
    public void test(){
        int array[][]=new int[4][3];
        for (int i=0,x=10;i<4;i++){
            for (int j=0;j<3;j++,x+=10){
                array[i][j]=x;
            }
        }for (int i=0;i<4;i++){
            for (int j=0;j<3;j++){
                System.out.print(array[i][j]+" ");
            }System.out.println();
        }System.out.println();
    }
    public static void main(String[] args) {
    TwoDimensionalArrayEx t=new TwoDimensionalArrayEx();
    t.test();
    }
}
