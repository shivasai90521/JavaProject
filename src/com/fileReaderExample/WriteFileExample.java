package com.fileReaderExample;

import java.io.FileWriter;

public class WriteFileExample {
    public void write() {
        try {
            FileWriter fw = new FileWriter("C:\\Users\\S\\Desktop\\file.txt",true);
            String str = "hello this is file from java program";
            fw.write(str);
            fw.close();
            System.out.print("File has been updated");
        }catch (Exception exception){
            exception.printStackTrace();
        }
    }

    public static void main(String[] args) {
        WriteFileExample w=new WriteFileExample();
        w.write();
    }
}