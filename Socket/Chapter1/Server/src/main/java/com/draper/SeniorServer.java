package com.draper;

import java.io.IOException;
import java.io.InputStream;

/**
 * 运用了回调，创建两个线程
 *
 * @author draper_hxy
 */
public class SeniorServer {

    public static void main(String[] args) {
        new SendMessageThread(54321, new SeniorServer().sendMsglistener()).start();
    }

    private SocketReceiveListener sendMsglistener() {
        return (in, out) -> {
            while (true) {
                byte[] bytes = initInputStream(in);
                System.out.println(new String(bytes));
            }
        };
    }

    /**
     * 输入流初始化
     *
     * @param in
     * @return
     */
    private byte[] initInputStream(InputStream in) {
        byte[] buffer = new byte[1024 * 5];
        try {
            int len = in.read(buffer);
            byte[] bytes = new byte[len];
            System.arraycopy(buffer, 0, bytes, 0, len);
            return bytes;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
