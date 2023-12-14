package org.example.java8;

public class JavaLamda {
    public static void main(String[] args) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello world!");
            }
        };
        runnable.run();

        Runnable runnable2 = () -> System.out.println("Hello world two!");
        runnable2.run();
    }
}
