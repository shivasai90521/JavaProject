package com.ControllerStatementsExamples;

public class ElseIfExample {
    public void check(int age, String gender){
        if (age>=18){
            if (gender =="male"){
                System.out.println("He is major");
            }else if (gender=="female"){
                System.out.println("She is major");
            } else if (gender=="Third gender") {
                System.out.println("third gender");
            }else {
                System.out.println("please mention the gender");
            }
        }else {
            System.out.println("The person is not major");
        }
    }
    public static void main(String[] args) {
     ElseIfExample ex=new ElseIfExample();
     ex.check(8,"male");
    }
}
