package com.IntroductionExample;

public class SwitchEx {
    String iName;
    public void store(String x) {
        iName = x;
    }
    public void test(){
        switch (iName){
            case "ABC":
                System.out.println("hello");
                break;
            case "def":
                System.out.println("namaste");
                break;
            case "ghi":
                System.out.println("guru");
                break;
            default:
                System.out.println("not eligible");
                break;
        }

    }

    public static void main(String[] args) {
        SwitchEx s=new SwitchEx();
        s.store("ABC");
        s.test();
    }
}
