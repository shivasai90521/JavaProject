package com.ControllerStatementsExamples;

public class nestedForLoopEx1 {
    public void test(){
        for (int i=1;i<10;i++){
            for (int j=0;j<10;j++){
                System.out.println("These are 'i' values: "+i+","+j);
            }
        }
    }
    public static void main(String[] args) {
        nestedForLoopEx1 nes=new nestedForLoopEx1();
        nes.test();
    }
}
