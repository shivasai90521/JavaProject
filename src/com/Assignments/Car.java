package com.Assignments;

public class Car implements Vehical{
    @Override
    public void start() {
        System.out.println("Start the car");
    }

    @Override
    public void stop() {
        System.out.println("stop the car");

    }
}