package com.fileReaderExample;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerEx {
    public void scRead() {
        try {
            Scanner sc = new Scanner(new File("C:\\Users\\S\\Desktop\\file.txt"));
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        }catch (FileNotFoundException exception){
            exception.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ScannerEx example=new ScannerEx();
        example.scRead();
    }
}