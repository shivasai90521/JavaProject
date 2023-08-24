package com.ArrayExample;

public class ArrayExample3 {
    public void display(int z) {
        int i[]=new int[z];
        for (int j=0,x=10;j<i.length;j++,x+=10){
            i[j]=x;
        }
        for (int j=0;j<i.length;j++){
            System.out.println(i[j]);
        }
    }
    public static void main(String[] args) {
        ArrayExample3 arr=new ArrayExample3();
        arr.display(150);
    }


}
