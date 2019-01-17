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


            // hasRemaining 是指 position 和 limit 中间是否有还有其他的 byte，如果有则继续读取
            while (byteBuffers.hasRemaining()) {
                // 因为这是 ByteBuffer 所以对于 utf-8 需要两个字节的汉字会是乱码
                System.out.println((char) byteBuffers.get());
            }

            byteBuffers.clear();
        } finally {
            // 调用 raf.close() 后其中的 channel 也会被 close
            raf.close();
        }

    }

}
