package com.PolymorphismExample;

public class CompileTimeExample {   //Method overloading
    public void test(){
        int i=10;
        int j=20;
        System.out.println("The sum of two numbers: "+i+j);
    }
    public void test(int a,int b){
        int c=a*b;
        System.out.println("The multiplication of two numbers: "+c);
    }
    public void test(int a,int b,int c){
        int d=a*b*c;
        System.out.println("The multiplication of three numbers: "+d);
    }
    public void test(int a,float b){
        float f=a+b;
        System.out.println("The addition of two numbers: "+f);
    }
    public void test(float f,double d){
        double c=f+d;
        System.out.println("The addition of two numbers: "+c);
    }

    public static void main(String[] args) {
        CompileTimeExample c=new CompileTimeExample();
        c.test();
        c.test(22,556);
        c.test(344,66.34f);
        c.test(33.25f,2344.5);
        c.test(35,87,67);

    }

}
