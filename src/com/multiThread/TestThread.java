package com.multiThread;

public class TestThread {
    public static void main(String[] args) {
        Table t1=new Table();
        ThreadOne one=new ThreadOne(t1);
        ThreadTwo two=new ThreadTwo(t1);
        ThreadThree three=new ThreadThree(t1);
    }
}
