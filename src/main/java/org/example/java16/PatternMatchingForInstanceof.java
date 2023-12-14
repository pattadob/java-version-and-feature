package org.example.java16;

public class PatternMatchingForInstanceof {
    public static void main(String[] args) {

        String obj = new String("Hello");

        if (obj instanceof String) {
            String s = (String) obj;
            // e.g. s.substring(1)
        }

        if (obj instanceof String s) {
            // Let pattern matching do the work!
            s.substring(1);
        }
    }
}
