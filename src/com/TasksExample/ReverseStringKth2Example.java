package com.TasksExample;

public class ReverseStringKth2Example {
    public void m1(){
        String s = "Let's reverse the first kth string in given string";
        String a[] = s.split(" ");
        for (int i=a.length-1;i>=0;i--){
         System.out.print(a[i]+" ");
        }
        System.out.println(" ");
        StringBuffer sb=new StringBuffer(a[5]+" ");
        sb.append(s);
        System.out.println(sb);
    }

    public static void main(String[] args) {
        ReverseStringKth2Example res=new ReverseStringKth2Example();
        res.m1();
    }
}