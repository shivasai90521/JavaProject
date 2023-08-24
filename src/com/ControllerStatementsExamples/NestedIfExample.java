package com.ControllerStatementsExamples;

public class NestedIfExample {
    int age;
    public void store(int x){
        age=x;
    }
    public void test(){
        if(age>=18) {
            System.out.println("you are eligible for vote");
            if (age >= 25) {
                System.out.println("you are eligible for participate in election");
            }
        }else {
                System.out.println("you are not eligible for voting");
            }
        }
    public static void main(String[] args) {
        NestedIfExample ex=new NestedIfExample();
        ex.store(18);
        ex.test();
    }
}
