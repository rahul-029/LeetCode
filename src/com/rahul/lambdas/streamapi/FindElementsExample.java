package com.rahul.lambdas.streamapi;

import jdk.nashorn.internal.parser.JSONParser;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindElementsExample {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 2, 1);

        Optional<Integer> element = list.stream().findFirst();
        if(element.isPresent()){
            System.out.println(element.get());
        } else {
            System.out.println("Stream is empty");
        }

        Optional<Integer> element1 = list.stream().findAny();
        if(element1.isPresent()){
            System.out.println(element1.get());
        } else {
            System.out.println("Stream is empty");
        }

    }
}
