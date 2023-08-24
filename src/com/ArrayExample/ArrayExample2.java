package com.ArrayExample;

public class ArrayExample2 {
    public void test(int z) {
        byte[] b = new byte[z];
        for (byte i = 0; i < b.length; i++) {
            System.out.println(b);
        }
    }

    public static void main(String[] args) {
        ArrayExample2 arr = new ArrayExample2();
        arr.test(10);
    }
}