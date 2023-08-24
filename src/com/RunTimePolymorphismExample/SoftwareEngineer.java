package com.RunTimePolymorphismExample;

public class SoftwareEngineer extends Engineer{
    @Override
    public void work(){
        super.work();
        System.out.println("Software Engineer works");
    }

}
