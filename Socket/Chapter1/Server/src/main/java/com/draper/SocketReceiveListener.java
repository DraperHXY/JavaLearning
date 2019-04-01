package com.draper;

import java.io.InputStream;
import java.io.OutputStream;

/**
 * @author draper_hxy
 */
public interface SocketReceiveListener {

    void receive(InputStream in, OutputStream out);

}
