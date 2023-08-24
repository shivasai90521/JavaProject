package com.PolymorphismExample;

public class ReturnDataTypesEx{
    public int display(){
        int a=10;
        int b=70;
        return a+b;
    }
    public float m1(){
        float a=10.25f;
        float b=22.768f;
        return a+b;
    }
    public  double m2(){
       int n=123;
        return n;
    }
    public char m3(){
        char c='A';
        return c;
    }
    public String m4(){
        return "Shiva";
    }
    public boolean m5(){
        return true;
    }
    public long m6(){
        long l=23445454;
        long k=2345454;
        return l+k;
    }
    public byte m7(){
        byte b=0;
        byte d=1;
        return d;
    }
    public static void main(String[] args) {
        ReturnDataTypesEx res=new ReturnDataTypesEx();
        res.display();
        float t=res.m1();
        res.m2();
        res.m3();
        res.m4();
        res.m5();
        res.m6();
        res.m7();
        System.out.println("Successfully inserted  values");
        System.out.println(res.display());
        System.out.println(t);
        System.out.println(res.m2());
        System.out.println(res.m3());
        System.out.println(res.m4());
        System.out.println(res.m5());
        System.out.println(res.m6());
        System.out.println(res.m7());
    }
}
