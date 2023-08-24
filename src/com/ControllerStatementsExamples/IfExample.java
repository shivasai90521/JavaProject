package com.ControllerStatementsExamples;

public class IfExample {
    public void store(int i){
        if(i>=5){
            System.out.println("Enter the statement");
            System.out.println("print the 'i' value is: "+i);
        }
        System.out.println("not enter to the statement ");
    }
    public static void main(String[] args) {
    IfExample i=new IfExample();
    i.store(2);
    }
}
