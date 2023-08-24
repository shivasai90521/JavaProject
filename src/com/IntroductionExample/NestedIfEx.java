package com.IntroductionExample;

public class NestedIfEx {
    int i;
    public void store(int x){
        i=x;
    }
    public void check(){
        if (i<=18){
            System.out.println("eligible for voting");
            if(i<=25){
                System.out.println("eligible for participate in elections");
            }
        }else {
            System.out.println("not eligible");
        }
    }

    public static void main(String[] args) {
        NestedIfEx n=new NestedIfEx();
        n.store(14);
        n.check();
    }
}
