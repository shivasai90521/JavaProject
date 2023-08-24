package com.LoopsExample;

public class SwitchEx3 {
    public void year(int k){
        switch (k){
            case 1:
                System.out.println(2012);
                break;
            case 2:
                System.out.println(2013);
                break;
            case 3:
                System.out.println(2014);
                break;
            case 4:
                System.out.println(2015);
                break;
            case 5:
                System.out.println(2016);
                break;
            case 6:
                System.out.println(2017);
                break;
            case 7:
                System.out.println(2018);
                break;
            case 8:
                System.out.println(2019);
                break;
            case 9:
                System.out.println(2020);
                break;
            case 10:
                System.out.println(2021);
                break;
            case 11:
                System.out.println(2022);
                break;
            default:
                System.out.println("you can enter correct year");
        }
    }
    public static void main(String[] args) {
    SwitchEx3 s=new SwitchEx3();
    s.year(0);
    }
}
