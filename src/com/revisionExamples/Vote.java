package com.revisionExamples;

public class Vote {
    int age;
    public void store(int x){
        age=x;
    }
    public void test(){
        if (age>=18){
            System.out.println("Youre eligible for voting");
            if (age>=25) {
                System.out.println("you are eligible to participating for election");
            }
            else
            {
                System.out.println("you are not eligible to participating for election");
            }
        }
        else
            System.out.println("you are not eligible for voting");
    }

    public static void main(String[] args) {
        Vote v=new Vote();
        v.store(18);
        v.test();
    }
}
