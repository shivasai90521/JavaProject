package com.oopsExample;

public class TestEncapsulation {
    public static void main(String[] args) {
        EncapsulationExample ex=new EncapsulationExample();
        ex.setId(1001);
        ex.setName("Shiva");
        ex.setEmail("Shivasai90521@gmail.com");
        ex.setPlace("Bangalore");
        System.out.println(ex.getId()+" "+ex.getName()+" "+ex.getEmail()+" "+ex.getPlace());
    }
}


