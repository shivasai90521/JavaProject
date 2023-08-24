package com.oopsExample;

public class MathExample {
    public static void main(String[] args) {
        int  x=30;
        int y=20;
        System.out.println(Math.cos(x));
        System.out.println(Math.max(x,y));
        System.out.println(Math.min(x,y));
        System.out.println(Math.sin(Math.toRadians(90)));
        System.out.println(Math.sin(Math.toRadians(0)));
        System.out.println(Math.tan(Math.toRadians(45)));
        System.out.println(Math.nextAfter(23,90));
        System.out.println(Math.random());
        System.out.println(Math.ceil(22.01));
        System.out.println( Math.floor(22.99));
        System.out.println(Math.round(21.6));
        System.out.println(Math.sqrt(4));
        System.out.println(Math.pow(5,2));
        System.out.println(Math.PI);
        System.out.println(Math.TAU);
        System.out.println(Math.incrementExact(88));
        System.out.println(Math.absExact(33));
        System.out.println(Math.absExact(x));

    }
}
