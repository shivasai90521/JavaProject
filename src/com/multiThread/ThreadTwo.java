package com.multiThread;

public class ThreadTwo extends Thread{
    Table table;
    public void run(){
        table.m1(9);
    }
    ThreadTwo(Table table){
        this.table=table;
        this.start();
    }
}
