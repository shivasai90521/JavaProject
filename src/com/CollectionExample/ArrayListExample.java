package com.CollectionExample;
import java.util.ArrayList;
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList <Integer> list=new ArrayList<Integer>();
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);
        System.out.println("ArrayList values is: "+list);
        System.out.println(list.add(100));
        System.out.println(list.contains(200));
        System.out.println (list.size());
        list.remove(3);
        System.out.println(list);
        System.out.println(list.set(3,900));
        list.add(5,600);
        System.out.println(list);
        list.add(700);
        System.out.println(list);
    }
}