package com.draper;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;

/**
 * @author draper_hxy
 */
public class MyClassLoader extends ClassLoader {

    public MyClassLoader() {}

    public MyClassLoader(ClassLoader parent) {
        super(parent);
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        File file = null;
        try {
            file = getClassFile(name);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            byte[] bytes = getClassBytes(file);
            Class<?> c = this.defineClass(name, bytes, 0, bytes.length);
            return c;
        } catch (IOException e) {
            e.printStackTrace();
            return super.findClass(name);
        }
    }

    private File getClassFile(String name) throws FileNotFoundException {
        File file = new File(
            "/Users/draper/Documents/Developments/Java/JavaLearning/JVM/CustomClassLoader/src/main/java/com/draper/Person.class");
        if (file.exists()) {
            return file;
        }
        System.err.println("文件不存在");
        return null;
    }

    private byte[] getClassBytes(File file) throws IOException {
        FileInputStream fis = new FileInputStream(file);
        FileChannel fc = fis.getChannel();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        WritableByteChannel wbc = Channels.newChannel(baos);
        ByteBuffer by = ByteBuffer.allocate(1024);
        while (true) {
            int i = fc.read(by);
            if (i == 0 || i == -1) {
                break;
            }
            by.flip();
            wbc.write(by);
            by.clear();
        }
        fis.close();
        return baos.toByteArray();
    }
}
