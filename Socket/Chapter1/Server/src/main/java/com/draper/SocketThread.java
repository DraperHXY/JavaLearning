package com.draper;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author draper_hxy
 */
public class SocketThread extends Thread {

    private SocketReceiveListener listener;
    private Socket socket;

    public SocketThread(Socket socket, SocketReceiveListener listener) {
        this.listener = listener;
        this.socket = socket;
    }

    @Override
    public void run() {
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {
            inputStream = socket.getInputStream();
            outputStream = socket.getOutputStream();
            listener.receive(inputStream, outputStream);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            close(inputStream, outputStream, socket);
        }
    }

    private void close(InputStream inputStream, OutputStream outputStream, Socket s) {
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
