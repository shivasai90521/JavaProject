package com.TasksExample;

public class DuplicateElementsInArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 6, 7, 4, 3, 6, 1};
       // System.out.println("Total elements in array"+arr.length);
        System.out.println("Duplicate elements in given array");
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]==arr[j]){
                    System.out.println(arr[j]);
                }
            }
        }
    }
}