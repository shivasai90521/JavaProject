package com.multiThread;

public class Table {
    public synchronized void m1(int j){
        for (int i=1;i<=10;i++){
            System.out.println(j+"*"+i+"="+(i*j));
        }
    }
}
