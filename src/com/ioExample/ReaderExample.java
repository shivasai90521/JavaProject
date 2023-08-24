package com.ioExample;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReaderExample {
    Employee emp=new Employee();
    public void store()throws Exception {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please Enter Employee ID");
        int id=Integer.valueOf(br.readLine());
        System.out.println("Please Enter Employee Name");
        String name=br.readLine();
        System.out.println("Please Enter Employee Salary");
        double sal=Double.valueOf(br.readLine());
        System.out.println("Please Enter Employee Mobile Number");
        long mob=Long.valueOf(br.readLine());
        emp.setId(id);
        emp.setName(name);
        emp.setSalary(sal);
        emp.setMobile(mob);
    }
    public void display(){
        System.out.println("Employee details are: "+emp);
    }

    public static void main(String[] args) throws Exception{
        ReaderExample ex=new ReaderExample();
        ex.store();
        ex.display();
    }
}
