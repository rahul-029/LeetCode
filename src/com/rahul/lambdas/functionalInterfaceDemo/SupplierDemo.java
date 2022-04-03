package com.rahul.lambdas.functionalInterfaceDemo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo {

    /*@Override
    public String get() {
        return "Hello world";
    }*/

    public static void main(String[] args) {
        /*Supplier<String> supplier = new SupplierDemo();
        System.out.println(supplier.get());*/

        Supplier<String> supplier = () -> "Hello World";
        System.out.println(supplier.get());

        List<String> list = Arrays.asList();
        System.out.println(list.stream().findAny().orElseGet(supplier));
    }
}
