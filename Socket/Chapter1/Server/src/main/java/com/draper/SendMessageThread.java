package com.draper;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 这个类的核心在于可以接收多个 SocketClient 进行注册
 *
 * @author draper_hxy
 */
public class SendMessageThread extends Thread {

    private int port;
    private SocketReceiveListener listener;

    public SendMessageThread(int port, SocketReceiveListener listener) {
        this.port = port;
        this.listener = listener;
    }

    @Override
    public void run() {
        try {
            ServerSocket serverSocket = new ServerSocket();
            serverSocket.setReuseAddress(false);
            serverSocket.bind(new InetSocketAddress(port));

            while (true) {
                Socket socket = serverSocket.accept();
                new SocketThread(socket, listener).start();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
