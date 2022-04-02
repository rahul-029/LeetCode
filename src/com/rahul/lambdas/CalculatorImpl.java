package com.rahul.lambdas;


interface Calculator{
    //void switchOn();
    //void printValue(int input);
    int subtract(int first, int second);
}


public class CalculatorImpl {


    public static void main(String[] args) {

        /*Calculator calculator = () -> {
            System.out.println("Switch On");
        };

        calculator.switchOn();*/

        /*Calculator calculator = (input) -> System.out.println(input);
        calculator.printValue(1234);*/


        Calculator calculator = (first, second) -> {
          if(second < first){
              return first - second;
          } else {
              return second - first;
          }
        };

        System.out.println(calculator.subtract(8, 20));

    }
}
