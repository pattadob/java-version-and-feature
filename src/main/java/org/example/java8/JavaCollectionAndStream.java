package org.example.java8;

import java.util.Arrays;
import java.util.List;

public class JavaCollectionAndStream {
    public static void main(String[] args) {
        // Functional-style operations for collections
        List<String> list = Arrays.asList("franz", "ferdinand", "fiel", "vom", "pferd");

        // Stream
        list.stream()
                .filter(n -> n.startsWith("f"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);
    }
}
