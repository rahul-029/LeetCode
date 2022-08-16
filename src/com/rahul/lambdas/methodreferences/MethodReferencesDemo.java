package com.rahul.lambdas.methodreferences;

import java.util.function.BiFunction;
import java.util.function.Function;

@FunctionalInterface
interface Printable{
    void print(String msg);
}


public class MethodReferencesDemo {

    public static int addition (int a, int b){
        return (a + b);
    }

    public void display(String msg){
        msg = msg.toUpperCase();
        System.out.println(msg);
    }

    public static void main(String[] args) {

        // 1. Method reference to a static method
        // lambda expression
        Function<Integer, Double> function = (input) -> Math.sqrt(input);
        System.out.println(function.apply(4));

        // using method reference
        Function<Integer, Double> functionMethodRef =  Math::sqrt;
        System.out.println(function.apply(4));

        // lambda expression
        BiFunction<Integer, Integer, Integer> biFunction = (a, b) -> MethodReferencesDemo.addition(a, b);
        System.out.println(biFunction.apply(10, 20));

        // using method reference
        BiFunction<Integer, Integer, Integer> biFunctionMethodRef = MethodReferencesDemo::addition;
        System.out.println(biFunctionMethodRef.apply(20, 30));

        MethodReferencesDemo methodReferencesDemo = new MethodReferencesDemo();
        // 2. Method reference to an instance method
        // lambda expression
        Printable printable = (msg) -> methodReferencesDemo.display(msg);
        printable.print("hello world");

        // using method reference
        Printable printableMethodRef =  methodReferencesDemo::display;
        printableMethodRef.print("this is now converted to uppercase");

        // 3. Reference to an instance method of an arbitrary object
        // lambda expression
        Function<String, String > stringFunction = (String input) -> input.toLowerCase();
        System.out.println(stringFunction.apply("HELLO WORLD"));

        // using method reference
        Function<String, String > stringFunctionMethodRef =  String::toLowerCase;
        System.out.println(stringFunctionMethodRef.apply("THIS WOULD COME IN LOWERCASE"));

    }
}
