package com.rahul.lambdas.streamdemo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachDemo {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("John", "Cena", "Steve", "Austin");

       /* for(String s: list){
            System.out.println(s);
        }*/

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
