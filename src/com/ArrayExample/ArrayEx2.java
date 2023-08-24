package com.ArrayExample;

public class ArrayEx2 {
    public void display(){
        int []array=new int[5];
        for(int i=0,x=10;i<5;i++,x+=10){
            array[i]=x;
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {
        ArrayEx2 a=new ArrayEx2();
        a.display();
    }

}
