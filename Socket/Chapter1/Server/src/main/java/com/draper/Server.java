package com.draper;


import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author draper_hxy
 */
public class Server {

    private static final int port = 54321;

    public static void main(String[] args) throws IOException, InterruptedException {
        ServerSocket serverSocket = new ServerSocket(port);
        serverSocket.setReuseAddress(true);

        Thread readThread = new Thread(() -> {
            Socket socket = null;
            try {
                socket = serverSocket.accept();
            } catch (IOException e) {
                e.printStackTrace();
            }

            while (true) {
                InputStream in = null;
                try {
                    Thread.sleep(1500);
                    in = socket.getInputStream();

                    byte[] temBuffer = new byte[1024 * 5];
                    int len = in.read(temBuffer);
                    if (len == -1) {
                        Thread.sleep(1000);
                        continue;
                    } else {
                        byte[] ins = new byte[len];
                        System.arraycopy(temBuffer, 0, ins, 0, len);
                        String str = new String(ins);
                        System.out.println(str);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
//                    close(in, null, null);
                }

            }
        });

        readThread.start();
    }


    private static void close(InputStream inputStream, OutputStream outputStream, Socket s) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        if (s != null) {
            try {
                s.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
