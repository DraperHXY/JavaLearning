package com.draper.io;

import java.io.*;


/**
 * 接受链接流处理器
 */
public class LinkInputStreamTest {

    public static void main1(String[] args) throws IOException {
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

    /**
     *
     * @param args
     * @throws IOException
     */
    public static  void main(String [] args)throws IOException{
        String line;
        InputStreamReader input = new InputStreamReader(System.in);
        System.out.println("Enter data and push enter:");
        BufferedReader reader = new BufferedReader(input);
        line = reader.readLine();
        System.out.println("Data entered :"+line);
    }



}
