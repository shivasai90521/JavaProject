package com.RunTimePolymorphismExample;

public class Asus extends Laptop{
    @Override
    public void test(){
        super.test();
        System.out.println("This Asus laptop");
    }
}
