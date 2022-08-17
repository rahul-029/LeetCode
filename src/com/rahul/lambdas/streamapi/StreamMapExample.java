package com.rahul.lambdas.streamapi;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMapExample {

    public static void main(String[] args) {

        List<String> lowerCaseList = Arrays.asList("a", "b", "c", "d");
        List<String> upperCaseList = lowerCaseList.stream().map(String::toUpperCase).collect(Collectors.toList());
        upperCaseList.forEach(System.out::println);

        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> multiplesList = integerList.stream().map((number) -> number * 5).collect(Collectors.toList());
        multiplesList.forEach(System.out::println);

        List<String> list = Arrays.asList("John", "Cena", "Steve", "Austin");
        list.stream().forEach(t -> System.out.println(t));

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "John");
        map.put(2, "Cena");
        map.put(3, "Steve");
        map.put(4, "Austin");

        map.entrySet().stream().forEach(obj -> System.out.println(obj));
        map.forEach((key, value) -> System.out.println(key + ":" + value));

        //filter
        map.entrySet().stream().filter((k) -> k.getKey() % 2 == 0).forEach(System.out::println);
    }
}
