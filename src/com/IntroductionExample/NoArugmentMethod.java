package com.IntroductionExample;

public class NoArugmentMethod {
    public void add(){
        int a=10;
        int b=20;
        int c=a+b;
        System.out.println("The addition of two numbers: "+c);
    }
    public void sub(){
        int a=30;
        int b=40;
        int c=a+b;
        System.out.println("The subtraction of two numbers: "+c);
    }
    public void mul(){
        int a=50;
        int b=60;
        int c=a+b;
        System.out.println("the multiplication of two numbers: "+c);
    }
    public void div(){
        int a=70;
        int b=80;
        int c=a+b;
        System.out.println("the division of two numbers: "+c);
    }

    public static void main(String[] args) {
        NoArugmentMethod n=new NoArugmentMethod();
        n.add();
        n.sub();
        n.mul();
        n.div();
    }
}
