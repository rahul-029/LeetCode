package com.rahul.lambdas.streamapi;

import java.util.*;
import java.util.stream.Stream;

public class CreateStreamObjects {

    public static void main(String[] args) {

        // Create a stream
        Stream<String> stream = Stream.of("a", "b", "c");
        stream.forEach(System.out::println);

        // Creating stream from sources
        Collection<String> stream1 = Arrays.asList("JAVA", "J2EE", "Spring", "Hibernate");
        stream1.forEach(System.out::println);

        List<String> list = Arrays.asList("JAVA", "J2EE", "Spring", "Hibernate");
        list.stream().forEach(System.out::println);

        Set<String> set = new HashSet<>(list);
        Stream<String> stream2 = set.stream();
        stream2.forEach(System.out::println);

        String[] strArray = {"a", "b", "c"};
        Arrays.stream(strArray).forEach(System.out::println);
    }
}
