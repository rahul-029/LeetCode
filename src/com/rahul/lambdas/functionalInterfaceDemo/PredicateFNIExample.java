package com.rahul.lambdas.functionalInterfaceDemo;


import java.util.function.Predicate;

/*class PredicateImpl implements Predicate<Integer>{

    @Override
    public boolean test(Integer integer) {
        if(integer % 2 == 0){
            return true;
        }
        return false;
    }
}*/


public class PredicateFNIExample {

    public static void main(String[] args) {

//        Predicate<Integer> predicate = new PredicateImpl();
//        System.out.println(predicate.test(11));

        Predicate<Integer> predicate =   (input) -> {
            if(input % 2 == 0){
                return true;
            }
            return false;
        };

        System.out.println(predicate.test(10));
    }
}
