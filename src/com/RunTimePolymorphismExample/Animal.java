package com.RunTimePolymorphismExample;

public class Animal {
    public void eat(){    //No argument method
        System.out.println("Eating Animals");
    }
    public  Animal(int i, int j){    //parametrised Constructor
        int c=i+j;
        System.out.println("This is default constructor: "+c);
    }

}
