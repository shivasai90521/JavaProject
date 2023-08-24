package com.ArrayExample;

public class ArrayExample4{
    public void display(){
        long l[]=new long[3];
        long x = 100l;
        for (int j=0;j<3;j++,x+=1000l){
            l[j]=x;
        }for (int j=0;j<3;j++){
            System.out.println(l[j]);
        }
    }
    public static void main(String[] args) {
    ArrayExample4 a=new ArrayExample4();
    a.display();
    }
}
