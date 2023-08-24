package com.IntroductionExample;

public class IfExample {
    public void check(int gender){

        if(gender>=23){
            System.out.println("male");
        }else {
            System.out.println("female");
        }
    }

    public static void main(String[] args) {
        IfExample i=new IfExample();
        i.check(22);
    }
}
