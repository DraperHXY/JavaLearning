package com.draper.nio;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

public class TransferTest {

    public static void main(String[] args) throws IOException {
        RandomAccessFile raf1 = new RandomAccessFile("fileA.txt", "rw");
        FileChannel fromChannel = raf1.getChannel();

        RandomAccessFile raf2 = new RandomAccessFile("fileB.txt", "rw");
        FileChannel toChannel = raf2.getChannel();

        int position = 0;
        long count = fromChannel.size();

        // 这两个效果一样
        fromChannel.transferTo(position, count, toChannel);
        toChannel.transferFrom(fromChannel, 0, count);

    }

}
