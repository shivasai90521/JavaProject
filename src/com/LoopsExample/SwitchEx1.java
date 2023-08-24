package com.LoopsExample;

public class SwitchEx1 {
    public void month(char s){
        switch (s){
            case 'a':
                System.out.println("This is jan month");
                break;
            case 'b':
                System.out.println("This is feb month");
                break;
            case 'c':
                System.out.println("This is mar month");
                break;
            case 'd':
                System.out.println("This is apr month");
                break;
            case 'e':
                System.out.println("This is may month");
                break;
            case 'f':
                System.out.println("This is jun month");
                break;
            case 'g':
                System.out.println("This is jul month");
                break;
            case 'h':
                System.out.println("This is aug month");
                break;
            case 'i':
                System.out.println("This is sep month");
                break;
            case 'j':
                System.out.println("This is oct month");
                break;
            case 'k':
                System.out.println("This is nov month");
                break;
            case 'l':
                System.out.println("This is dec month");
                break;
            default:
                System.out.println("There is no month based on char");
                break;
        }
    }
    public static void main(String[] args) {
        SwitchEx1 ex=new SwitchEx1();
        ex.month('s');
    }
}
