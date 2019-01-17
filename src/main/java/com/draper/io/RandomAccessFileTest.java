package com.draper.io;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

    public static void main(String[] args) throws IOException {
        RandomAccessFile raf = new RandomAccessFile(new File("a.txt"), "rw");
        raf.writeInt(1);
        raf.writeUTF("艹");
        raf.writeDouble(5.5d);

        //移动指针的偏移量到文件开始
        raf.seek(0);
        System.out.println(raf.readInt());
        System.out.println(raf.readUTF());
        System.out.println(raf.readDouble());

        //在文件末尾追加内容
        raf.seek(raf.length());
        raf.write(".......".getBytes());


    }

}
