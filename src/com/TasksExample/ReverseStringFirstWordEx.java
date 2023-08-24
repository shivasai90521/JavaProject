package com.TasksExample;

public class ReverseStringFirstWordEx {
    public static void main(String[] args) {
        String s="welcome to our octopus institute";
        String w[]=s.split(" ");
        StringBuffer sb=new StringBuffer(w[4]);
        sb.reverse();
        for (int i=0;i<w.length;i++){
            sb.append(" "+w[i]+" ");
        }
        System.out.println(sb);
    }
}

