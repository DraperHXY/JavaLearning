package com.draper.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathsTest {

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("~/bb");
        path = Paths.get("img1/img2/img3/img4/img5");
        if (!Files.exists(path)) {
            Files.createDirectories(path);
        }
    }

}
