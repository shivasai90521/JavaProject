package com.TasksExample;

    public class StringbuilderExample {
        public static void main(String[] args) {
            StringBuilder be=new StringBuilder("hi Mohan");
            System.out.println(be);
            System.out.println(be.append(" my friend"));
            System.out.println(be.delete(3,5));
            System.out.println(be.insert(5,"hi"));
            System.out.println(be.deleteCharAt(7));
            System.out.println(be.indexOf("gi",8));
            System.out.println(be.isEmpty());
            System.out.println(be.replace(0,7,"good morning my friend"));
            System.out.println(be.equals("hi"));
        }
    }


