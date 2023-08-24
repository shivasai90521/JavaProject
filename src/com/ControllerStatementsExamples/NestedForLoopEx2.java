package com.ControllerStatementsExamples;

public class NestedForLoopEx2 {
    public void display(){
        for (long l=0;l<=15;l++){
            for (long j=5;j<=5;j++){
                System.out.println("These are 'i' values is: "+l+":"+j);
            }
        }
    }

    public static void main(String[] args) {
        NestedForLoopEx2 nes=new NestedForLoopEx2();
        nes.display();
    }
}
