package com.draper.io;


import java.io.*;
import java.util.zip.ZipInputStream;

public class InputStreamToReader {

    public static void main1(String[] args) throws IOException {
        InputStream inputStream = new FileInputStream("fileA.txt");
        Reader reader = new InputStreamReader(inputStream);
        int data;
        while ((data = reader.read()) != -1) {
            System.out.print((char) data);
        }
        reader.close();
        Reader reader2 = new InputStreamReader(inputStream);
        int data2;
        while ((data2 = reader2.read()) != -1) {
            System.out.print((char) data2);
        }
    }



}
