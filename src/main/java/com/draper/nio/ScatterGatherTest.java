package com.draper.nio;


import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;

public class ScatterGatherTest {

    public static void main(String[] args) throws IOException {
        RandomAccessFile raf = new RandomAccessFile("fileA.txt", "rw");
        FileChannel channel = raf.getChannel();

        ByteBuffer byteBuffer1 = ByteBuffer.allocate(1024);
        ByteBuffer byteBuffer2 = ByteBuffer.allocate(128);

        ByteBuffer[] byteBuffers1 = {byteBuffer1, byteBuffer2};

//        sout(byteBuffers1);

        // 使用两个 Buffer 从 channel 中读取数据，Scatter
        long flag = channel.read(byteBuffers1);

//        sout(byteBuffers1);

        ByteBuffer byteBuffer3 = ByteBuffer.allocate(1024);
        ByteBuffer byteBuffer4 = ByteBuffer.allocate(48);

        ByteBuffer[] byteBuffers2 = {byteBuffer3, byteBuffer4};

//        sout(byteBuffers2);

//        // 再将 byteBuffers2 中的数据写入到 channel 中


        // FIXME: 2019-01-18 申请一个新的 channel，之前的 channel 不可用，坏了
        FileChannel channelB = new RandomAccessFile("fileA.txt", "rw").getChannel();

        long data = channelB.read(byteBuffers2);

        while (data != -1) {

            sout(byteBuffers2);

            data = channelB.read(byteBuffers2);
        }

    }

    public static void sout(ByteBuffer... byteBuffers) {
        for (ByteBuffer byteBuffer : byteBuffers) {
            byteBuffer.flip();
            CharBuffer charBuffer = Charset.forName("utf-8").decode(byteBuffer);
            // 无需调用这个方法，已经是读模式了
//            charBuffer.flip();
            while (charBuffer.hasRemaining()) {
                System.out.print(charBuffer.get());
            }
            charBuffer.clear();
            byteBuffer.clear();
        }
    }

}
