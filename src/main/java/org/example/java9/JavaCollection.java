package org.example.java9;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class JavaCollection {
    public static void main(String[] args) {

        // Collection
        List<String> list = List.of("one", "two", "three");
        Set<String> set = Set.of("one", "two", "three");
        Map<String, String> map = Map.of("foo", "one", "bar", "two");

        // Stream
        Stream<String> stream = Stream.iterate("", s -> s + "s")
                .takeWhile(s -> s.length() < 10);
        stream.forEach(System.out::println);
    }
}
