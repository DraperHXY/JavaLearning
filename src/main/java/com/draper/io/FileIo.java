package com.draper.io;

import java.io.*;

public class FileIo {

    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("fileA.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("fileB.txt");

        byte[] buffer = new byte[128];

        while (fileInputStream.read(buffer) != -1) {
            fileOutputStream.write(buffer);
        }

    }

}
