package com.Youtubeexamples;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> books = new Stack<>();
        books.push("red");
        books.push(null);
        books.push("black");
        books.push("white");
        System.out.println(books.peek());
        //System.out.println(books.search("red"));
       // System.out.println(books.pop());
        //System.out.println(books.indexOf("red"));
        System.out.println(books);
    }
}