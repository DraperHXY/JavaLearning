package com.draper.nio;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FileChannelTest {

    public static void main(String[] args) throws IOException {
        RandomAccessFile raf = new RandomAccessFile("fileA.txt", "rw");
        try {
            FileChannel channel = raf.getChannel();

            // ByteBuffer position = 0, limit = capacity, 未初始化的 element = 0
            ByteBuffer byteBuffers = ByteBuffer.allocate(48);
            int data = 0;
            int i = 0;

            // 从 channel 中的数据读取到 buffer
            data = channel.read(byteBuffers);

            System.out.println("read:" + data);
            System.out.println(i++);

            // 翻转 buffer，因为当执行完 channel.read(byteBuffer) 后， position 到最后一个
            byteBuffers.flip();

            while (byteBuffers.hasRemaining()) {
                System.out.println((char) byteBuffers.get());
            }

            byteBuffers.clear();
        } finally {
            raf.close();
        }

    }

}
