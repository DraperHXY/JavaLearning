package com.draper.io;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.Arrays;

public class PipedTest {

    public static void main(String[] args) throws IOException {
        PipedInputStream pipedInputStream = new PipedInputStream();
        PipedOutputStream pipedOutputStream = new PipedOutputStream();
//        PipedOutputStream pipedOutputStream = new PipedOutputStream(pipedInputStream);

        // 管道建立连接，或者使用构造函数直接连接
        pipedInputStream.connect(pipedOutputStream);

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pipedOutputStream.write("Hello World".getBytes());
                    pipedOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    byte[] arr = new byte[128];
                    while (pipedInputStream.read(arr) != -1) {
                        System.out.println(Arrays.toString(arr));
                    }
                    pipedInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();

    }

}
