package com.RevisionCollection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList a1=new ArrayList();
        a1.add("welcome");
        a1.add(100);
        a1.add(15.5);
        a1.add("true");
        System.out.println(a1);
        //size
        System.out.println("Number of elements in array list:"+a1.size());
        //remove
        System.out.println( a1.remove(2));
        System.out.println();

       // System.out.println(a1.removeAll(a1));
        System.out.println(a1);
        System.out.println("remove all");

        //insert new element
        a1.add(2,"OOps");
        a1.add(1,"java");
        System.out.println("after insertion :"+a1);

        //retrieve specific element
        System.out.println(a1.get(1));
        a1.set(2,"HTML");
        System.out.println("After replacing element: "+a1);

        //Search -contains
        System.out.println(a1.contains("HTML"));
        //isEmpty()
        System.out.println(a1.isEmpty());

        //for loop,for each,iterator() by using 3 methods we can read the data
        System.out.println("Reading elements using for loop...........");
        for (int i=0;i< a1.size();i++){
            System.out.println(a1.get(i));
        }
        System.out.println("Reading elements using for each loop...........");
        for (Object e:a1) {
            System.out.println(e);
        }
        System.out.println("Reading elements using Iterator...........");
        Iterator it= a1.iterator();
        while (it.hasNext()){
            System.out.println(it.next()); //printing the element and move to next
        }
    }
}
