package com.rahul.lambdas.functionalInterfaceDemo;

import java.util.function.Consumer;

/*class ConsumerImpl implements Consumer<String>{

    @Override
    public void accept(String s) {
        System.out.println(s);
    }
}*/

public class ConsumerFNIExample {

    public static void main(String[] args) {

        // Traditional way
       /* Consumer<String> consumer = new ConsumerImpl();
        consumer.accept("Hello World !!!");*/

        // Lambda implementation
        Consumer<String> consumer =   (s) -> System.out.println(s);
        consumer.accept("Printing Hello World from a lambda call !!!");


    }
}
