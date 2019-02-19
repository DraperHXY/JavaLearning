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

    public static void main(String[] args) throws IOException {
        BufferedInputStream in = new BufferedInputStream((
                new BufferedInputStream(
                        new BufferedInputStream(
                                new BufferedInputStream(
                                        new BufferedInputStream(
                                                new BufferedInputStream(
                                                        new BufferedInputStream(
                                                                new BufferedInputStream(
                                                                        new BufferedInputStream(
                                                                                new BufferedInputStream(
                                                                                        new BufferedInputStream(
                                                                                                new BufferedInputStream(
                                                                                                        new BufferedInputStream(
                                                                                                                new BufferedInputStream(
                                                                                                                        new BufferedInputStream(
                                                                                                                                new BufferedInputStream(
                                                                                                                                        new FileInputStream("fileA.txt"))
                                                                                                                        )
                                                                                                                )
                                                                                                        )
                                                                                                )
                                                                                        )
                                                                                )
                                                                        )
                                                                )
                                                        )
                                                )
                                        ))))));

        byte[] data = new byte[1024];
        int end;

        while ((end = in.read(data)) != -1) {
            String str = new String(data, 0, end);
            System.out.println(str);
        }


    }

}
