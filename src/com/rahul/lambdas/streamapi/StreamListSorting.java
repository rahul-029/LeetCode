package com.rahul.lambdas.streamapi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamListSorting {

    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Orange");

        List<String> sortedList = fruits.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        sortedList.forEach(System.out::println);

        List<String> sortedList2 = fruits.stream().sorted((o1, o2) -> o1.compareTo(o2)).collect(Collectors.toList());
        sortedList2.forEach(System.out::println);

        List<String> sortedList3 = fruits.stream().sorted().collect(Collectors.toList());
        sortedList3.forEach(System.out::println);

        // Desc order
        List<String> sortedList4 = fruits.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        sortedList4.forEach(System.out::println);

        List<String> sortedList5 = fruits.stream().sorted((o1, o2) -> o2.compareTo(o1)).collect(Collectors.toList());
        sortedList5.forEach(System.out::println);
    }
}
