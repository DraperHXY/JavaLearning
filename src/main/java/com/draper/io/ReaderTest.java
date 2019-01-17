package com.draper.io;

import java.io.FileReader;
import java.io.IOException;

public class ReaderTest {

    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("fileA.txt");

        int intChar = reader.read();
        while (intChar != -1) {
            System.out.print(intChar + "\t");
            char data = (char) intChar;
            System.out.println(data);
            intChar = reader.read();
        }

    }

}
