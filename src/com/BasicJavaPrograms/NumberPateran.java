package com.BasicJavaPrograms;

public class NumberPateran {
    int count =1;
    public void test(){
        for (int i=1;i<5;i++){
            for (int j=1;j<=i;j++) {
                System.out.print(count);
                count++;
            }
            count=1;
            System.out.println();
        }
    }
    public static void main(String[] args) {
        NumberPateran n=new NumberPateran();
        n.test();
    }
}
