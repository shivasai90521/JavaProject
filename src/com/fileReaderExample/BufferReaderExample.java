package com.fileReaderExample;

import javax.imageio.IIOException;
import java.io.*;

public class BufferReaderExample {
    public void brRead() {
        try {
            File f = new File("C:\\Users\\S\\Desktop\\file.txt");
            FileReader fr = new FileReader(f);
            BufferedReader reader = new BufferedReader(fr);
            int i = 0;
            while ((i = reader.read()) != -1) {
                System.out.println((char) i);
            }
        }catch (FileNotFoundException exception){
            exception.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}