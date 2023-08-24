package com.TasksExample;

import java.util.Arrays;

public class ShiftArrayValues {
    public static void main(String[] args) {
        int arr[] = new int[]{1, 2, 3, 4, 5};
        int temp;
        for (int i=0;i<arr.length;i+=2)
        {
       for(int j=arr.length-1;j>=i+2;j--)
       {
           temp=arr[i];
           arr[i]=arr[j];
           arr[j]=temp;
       }
        }
        System.out.println(Arrays.toString(arr));
    }
}
