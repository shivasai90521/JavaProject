package com.RunTimePolymorphismExample;

public class CivilEngineer extends SoftwareEngineer{
    @Override
    public void work(){
        super.work();
        System.out.println("Civil Engineering Works");
    }

    public static void main(String[] args) {
        CivilEngineer c=new CivilEngineer();
        c.work();
    }
}
