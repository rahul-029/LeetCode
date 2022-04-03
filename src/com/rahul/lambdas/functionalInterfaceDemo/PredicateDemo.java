package com.rahul.lambdas.functionalInterfaceDemo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {
   /* @Override
    public boolean test(Integer t) {
        if(t % 2 == 0){
            return true;
        } else {
            return false;
        }
    }*/

    public static void main(String[] args) {
        /*Predicate<Integer> predicate = new PredicateDemo();
        System.out.println(predicate.test(10));*/

        /*Predicate<Integer> predicate = (t) -> {
            if(t % 2 == 0){
                return true;
            } else {
                return false;
            }
        };*/

        Predicate<Integer> predicate = t -> t % 2 == 0;

        System.out.println(predicate.test(4));

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        list.stream().filter(t -> t % 2 == 0).forEach(System.out::println);
        //list.stream().filter(t -> t % 2 == 0).forEach(t -> System.out.println(t));
    }
}
