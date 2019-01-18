package com.draper.nio;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;

public class FileChannelTest {

    /**
     * 这个打出来有乱码
     *
     * @param args
     * @throws IOException
     */
    public static void main1(String[] args) throws IOException {
        RandomAccessFile raf = new RandomAccessFile("fileA.txt", "rw");
        try {
            FileChannel channel = raf.getChannel();

            // ByteBuffer position = 0, limit = capacity, 未初始化的 element = 0
            ByteBuffer byteBuffers = ByteBuffer.allocate(48);
            int data = 0;
            int i = 0;

            // 从 channel 中的数据读取到 buffer
            data = channel.read(byteBuffers);

            // 这个循环的原因是如果文件大于 48bytes，那么一个 byteBuffers 是不够的
            // 所以在读取到 buffer 最后一个，channel 将继续将流读到 buffer 中，先前的 buffer 就被 clear 了
            while (data != -1) {
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
            }
        } finally {
            // 调用 raf.close() 后其中的 channel 也会被 close
            raf.close();
        }

    }

    /**
     * 修改上面的代码，使用 CharSet 转换 ByteBuffer 到 CharByte
     *
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {

        RandomAccessFile raf = new RandomAccessFile("fileA.txt", "rw");
        try {
            FileChannel channel = raf.getChannel();

            // ByteBuffer position = 0, limit = capacity, 未初始化的 element = 0
            ByteBuffer byteBuffer = ByteBuffer.allocate(48);
            int data = 0;
            int i = 0;

            // 从 channel 中的数据读取到 buffer
            data = channel.read(byteBuffer);

            // 这个循环的原因是如果文件大于 48bytes，那么一个 byteBuffer 是不够的
            // 所以在读取到 buffer 最后一个，channel 将继续将流读到 buffer 中，先前的 buffer 就被 clear 了
            while (data != -1) {

                // 翻转 buffer，因为当执行完 channel.read(byteBuffer) 后， position 到最后一个
                byteBuffer.flip();

                CharBuffer charBuffer = Charset.forName("utf-8").decode(byteBuffer);


                // hasRemaining 是指 position 和 limit 中间是否有还有其他的 byte，如果有则继续读取
                while (charBuffer.hasRemaining()) {
                    // 因为这是 ByteBuffer 所以对于 utf-8 需要两个字节的汉字会是乱码
                    System.out.print(charBuffer.get());
                }

                byteBuffer.clear();
                charBuffer.clear();

                // 必须从 channel 中继续读取数据到 buffer 中
                data = channel.read(byteBuffer);
            }
        } finally {
            // 调用 raf.close() 后其中的 channel 也会被 close
            raf.close();
        }

    }

}
