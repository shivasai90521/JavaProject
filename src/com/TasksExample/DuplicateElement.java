package com.TasksExample;

public class DuplicateElement {
    public static void main(String[] args) {
        int a[]={1,3,3,5,6,9,8,3,5,10};
        for (int i=0;i<a.length-1;i++){
            for (int j=i;i<a.length;i++){
                if (a[i]==a[i]&&(i!=j)){
                    System.out.println("duplicate element "+a[i]);
                }
            }
        }
    }
}
