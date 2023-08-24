package com.BasicJavaPrograms;
public class ReverseNumber {
    public static void reverseNumber(int number) {
        if (number < 10) {
            System.out.println(number);
        }
        else
        {
            System.out.print(number % 10);
            reverseNumber(number/10);
        }
    }
    public static void main(String args[]) {
        reverseNumber(2939);
    }
}
