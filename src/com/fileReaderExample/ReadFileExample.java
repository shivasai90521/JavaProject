package com.fileReaderExample;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileExample {
    public void read() {
        try {
            FileReader fr = new FileReader("C:\\Users\\S\\Desktop\\file.txt");
            int i = 0;
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace(); //it is used for tracking exception where exact is
        }
    }

    public static void main(String[] args) {
        ReadFileExample ex=new ReadFileExample();
        ex.read();
    }
}