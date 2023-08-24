package com.multiThread;

public class ThreadOne extends Thread{
    Table table;
    public void run(){
        table.m1(3);
    }
    public ThreadOne(Table table){
        this.table=table;
        this.start();
    }
}
