package com.LoopsExample;

public class SwitchEx {
    public void display(int i){
        switch (i){
            case 1:
                System.out.println("This is jan month: "+i);
                break;
            case 2:
                System.out.println("This is feb month: "+i);
                break;
            case 3:
                System.out.println("This is mar month: "+i);
                break;
            case 4:
                System.out.println("This is apr month: "+i);
                break;
            case 5:
                System.out.println("This is may month: "+i);
                break;
            case 6:
                System.out.println("This is jun month: "+i);
                break;
            case 7:
                System.out.println("This is jul month: "+i);
                break;
            case 8:
                System.out.println("This is aug month: "+i);
                break;
            case 9:
                System.out.println("This is sep month: "+i);
                break;
            case 10:
                System.out.println("This is oct month: "+i);
                break;
            case 11:
                System.out.println("This is nov month: "+i);
                break;
            case 12:
                System.out.println("This is dec month: "+i);
                break;
            default:
                System.out.println("There is no month based on number");
                break;
        }
    }
    public static void main(String[] args) {
     SwitchEx s=new SwitchEx();
     s.display(8);
    }
}
