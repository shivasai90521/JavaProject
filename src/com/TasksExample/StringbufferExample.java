package com.TasksExample;

public class StringbufferExample {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("hello world");
        System.out.println(sb);
        sb.append('i');
        System.out.println(sb);
        System.out.println(sb.length());
        int i= sb.capacity();
        System.out.println(i);
        System.out.println(sb.charAt(1));
        System.out.println(sb.delete(1,5));
        System.out.println(sb.deleteCharAt(6));
        System.out.println(sb.lastIndexOf("world"));
        System.out.println(sb.insert(7,'s'));
        System.out.println(sb.reverse());
        System.out.println(sb.equals(" "));
    }
}
