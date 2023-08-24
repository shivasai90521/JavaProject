package com.Assignments;

 public class Even_number {
    public static void even() {
        int n = 20;
        for (int i = 1; i <= n; i++)
            if (i % 2 == 0) {
                System.out.println("even number:" + i);
            }
    }
    public static void odd() {
        int n = 20;
        for (int i = 1; i <= n; i++)
            if (i % 2 != 0) {
                System.out.println("odd number:" + i);
            }
    }

    public static void main(String[] args) {
         even();
       // odd();
    }
}

