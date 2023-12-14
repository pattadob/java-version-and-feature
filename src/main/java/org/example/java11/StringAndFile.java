package org.example.java11;

import java.nio.file.Files;
import java.nio.file.Path;

public class StringAndFile {
    public static void main(String[] args) {

        "Marco".isBlank();
        "Mar\nco".lines();
        "Marco  ".strip();

        try {
            Path path = Files.writeString(Files.createTempFile("helloworld", ".txt"), "Hi, my name is!");
            String s = Files.readString(path);
        }catch (Exception e){

        }
    }
}
