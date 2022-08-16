package com.rahul.lambdas.streamdemo;

import java.util.Arrays;
import java.util.List;

public class MapVsFlatmap {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        list.stream().map(t -> t * 5).forEach(System.out::println);

    }
}
