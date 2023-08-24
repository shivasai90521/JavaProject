package com.Assignments;

import java.util.Scanner;

public class ReverseNumberEx {
    public static void main(String[] args) {
        //By using Scanner class & StringBuffer & StringBuilder
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();

        //By using StringBuffer
        /*StringBuffer sb=new StringBuffer(String.valueOf(num));
        StringBuffer rev=sb.reverse();
        System.out.println("Reverse Number is: "+rev);*/

        //By using StringBuilder
        StringBuilder sbl=new StringBuilder();
        sbl.append(num);
        StringBuilder rev=sbl.reverse();
        System.out.println("Reverse number is: "+rev);
    }
}
