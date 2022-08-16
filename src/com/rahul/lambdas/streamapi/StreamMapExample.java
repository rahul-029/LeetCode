package com.rahul.lambdas.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapExample {

    public static void main(String[] args) {

        List<String> lowerCaseList = Arrays.asList("a", "b", "c", "d");
        List<String> upperCaseList = lowerCaseList.stream().map(String::toUpperCase).collect(Collectors.toList());
        upperCaseList.forEach(System.out::println);

        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> multiplesList = integerList.stream().map((number) -> number * 5).collect(Collectors.toList());
        multiplesList.forEach(System.out::println);
    }
}
