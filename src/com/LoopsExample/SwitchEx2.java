package com.LoopsExample;

public class SwitchEx2 {
    public void days(char i){
        switch (i){
            case 'a':
                System.out.println("Today is monday");
                break;
            case 'b':
                System.out.println("Today is tuesday");
                break;
            case 'c':
                System.out.println("Today is wed");
                break;
            case 'd':
                System.out.println("Today is thursday");
                break;
            case 'e':
                System.out.println("Today is friday");
                break;
            case 'f':
                System.out.println("Today is saturday");
                break;
            case 'g':
                System.out.println("Today is sunday");
                break;
            default:
                System.out.println("Looking forward to the Weekend");
                break;
        }
    }
    public static void main(String[] args) {
    SwitchEx2 s=new SwitchEx2();
    s.days('h');
    }
}
