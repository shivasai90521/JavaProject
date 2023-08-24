package com.oopsExample;

public class StringEx {
    public static void main(String[] args) {

        String str = "welcome";
        String str1=str.toUpperCase();
        str1=str1.toLowerCase();
        System.out.println(str1);

        str1.concat("to octopus institute");
        System.out.println(str1+"to java classes");

        String str2=" welcome to java courses ";
        int length=str2.length();
        System.out.println("The length of the string is :"+length);
        str2=str2.trim();
        System.out.println("removed spaces:"+str2);

        boolean b=str2.contains("wel");
        System.out.println("is the value contains 'wel':"+b);
        System.out.println("is the value contains 'cle':"+str2.contains("cle"));

        String str3=str2.substring(6);
       // System.out.println(str2);
        System.out.println(str3);
        System.out.println("after substring: "+str3);
        String str4=str2.substring(1,9);
        System.out.println(str4);
        char ch=str2.charAt(4);
        System.out.println(ch);
        int s=str3.length();
        System.out.println(s);
       String e= str2.replace('w','A');
        System.out.println(e);
        System.out.println(str2.endsWith(e));
    }
}