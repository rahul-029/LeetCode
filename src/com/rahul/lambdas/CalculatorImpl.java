package com.rahul.lambdas;


interface Calculator{
    void switchOn();
}


public class CalculatorImpl {


   /* @Override
    public void switchOn() {
        System.out.println("Switch On");
    }*/

    public static void main(String[] args) {

        Calculator calculator = () -> {
            System.out.println("Switch On");
        };

        calculator.switchOn();
    }
}
