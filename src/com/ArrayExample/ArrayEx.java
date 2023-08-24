package com.ArrayExample;

public class ArrayEx {
    public void display(){
        int []arr=new int[10];
        for (int j=0,x=10;j<10;j++,x+=10){
            arr[j]=x;
        }for (int j=0;j<10;j++){
            System.out.println(arr[j]);
        }
    }
    public static void main(String[] args) {
     ArrayEx a=new ArrayEx();
     a.display();
    }
}
