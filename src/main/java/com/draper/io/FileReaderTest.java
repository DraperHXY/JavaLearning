package com.draper.io;

import java.io.*;

public class FileReaderTest {

    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("fileB.txt");
        writer.write("Hello");
        writer.flush();
        writer.close();

        Reader reader = new FileReader("fileA.txt");
        reader = new BufferedReader(reader);
        String line;
        while ((line = ((BufferedReader)reader).readLine()) != null){
            System.out.println(line);
        }
        reader.close();
    }

}
