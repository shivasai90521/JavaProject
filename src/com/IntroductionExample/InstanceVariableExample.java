package com.IntroductionExample;

public class InstanceVariableExample     {
    int x;
    int y;
   public void mul(int a,int b){
       int c=a*b;
       System.out.println("multiplication of two numbers: "+c);
   }
   public static void main(String[] args) {
        InstanceVariableExample i=new InstanceVariableExample();
        i.mul(30,40);
        i.x=40;
        i.y=50;
        System.out.println(i.x);
        System.out.println(i.y);
    }
}
