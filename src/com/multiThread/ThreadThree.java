package com.multiThread;

public class ThreadThree extends Thread{
    Table table;
    public void run(){
        table.m1(4);
    }
    ThreadThree(Table table){
        this.table=table;
        this.start();
    }
}
