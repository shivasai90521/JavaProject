package com.BasicForLoopExample;

public class BreakContinueEx {
    public static void main(String[] args) {
        for (int i=1;i<10;i++){
            if (i==6){
                continue;
            }
            if (i==2){
               break;
            }
            System.out.println(i);
        }
        }
    }
