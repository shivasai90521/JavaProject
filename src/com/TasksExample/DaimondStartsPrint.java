package com.TasksExample;

public class DaimondStartsPrint {
    public static void main(String[] args) {
        //First part
        for (int i=1;i<=5;i++){      //Rows
            for (int j=5-i;j>0;j--){   //spaces
                System.out.print(" ");
            }
            for (int k=1;k<=2*i-1;k++){   //print starts
                System.out.print("*");
            }
            System.out.println();
        }
        //Second part
        for (int i=4;i>0;i--){
            for (int j=4-i;j>=0;j--){
                System.out.print(" ");
            }
            for (int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
