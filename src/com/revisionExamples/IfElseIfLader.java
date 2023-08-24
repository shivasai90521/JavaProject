package com.revisionExamples;

public class IfElseIfLader {
    public static void main(String[] args) {
        String str = "chrome";
        if (str=="edge"){
            System.out.println("This is edge browser");
        } else if (str=="safari") {
            System.out.println("this is safari browser");
        } else if (str=="chrome") {
            System.out.println("This is chrome browser");
        } else if (str=="opera") {
            System.out.println("This is opera browser");
        }
        else
            System.out.println("Not a supported browser");
    }
}