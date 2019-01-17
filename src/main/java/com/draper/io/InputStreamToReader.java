package com.draper.io;

import java.io.*;

public class InputStreamToReader {

    public static void main(String[] args) throws IOException {
        InputStream inputStream = new FileInputStream("fileA.txt");
        Reader reader = new InputStreamReader(inputStream);
        int data;
        while ((data = reader.read()) != -1) {
            System.out.print((char) data);
        }
    }

}
