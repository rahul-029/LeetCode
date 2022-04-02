package com.rahul.lambdas;


interface Calculator{
    //void switchOn();
    void printValue(int input);
}


public class CalculatorImpl {


    public static void main(String[] args) {

        /*Calculator calculator = () -> {
            System.out.println("Switch On");
        };

        calculator.switchOn();*/

        Calculator calculator = (input) -> System.out.println(input);
        calculator.printValue(1234);
    }
}
