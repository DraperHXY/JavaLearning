package com.draper;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author draper_hxy
 */
public class Client {

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 54321);
        System.out.println(socket.getLocalAddress().getHostName());
        OutputStream out = socket.getOutputStream();
        OutputStreamWriter writer = new OutputStreamWriter(out);
        while (true) {
            Scanner scanner = new Scanner(System.in);
            String str = scanner.nextLine();
            System.out.println(str);
            writer.write(str);
            writer.flush();
            out.flush();

        }
    }

}
