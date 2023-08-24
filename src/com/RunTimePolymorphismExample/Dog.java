package com.RunTimePolymorphismExample;

public class Dog extends Animal{

@Override
    public void eat(){    //No-argument  method
        System.out.println("Barking... ");
        super.eat();
    }
    public Dog(int i,int j){     //parametrised Constructor
        super(3,5);
        int c=i+j;
        System.out.println("This is constructor: "+c);
    }

}
