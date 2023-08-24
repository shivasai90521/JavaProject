package com.Assignments;

public abstract class Animal {
    public abstract void sound();

    public void dogs(){
        System.out.println("dog eats");
    }
    }
    class Dog extends Animal{

        @Override
        public void sound() {
            System.out.println("oooooo");
        }

        public static void main(String[] args) {
            Dog a=new Dog();
            a.dogs();
            a.sound();
        }
    }
