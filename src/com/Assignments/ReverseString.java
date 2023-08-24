package com.Assignments;

public class ReverseString {
    public static void main(String[] args) {
        String str="siva";
        String rev="";
       char a[]= str.toCharArray();
       for (int i=a.length-1;i>=0;i--){
           rev=rev+a[i];
       }
        System.out.println("Reverse string is: "+rev);
    }
}
