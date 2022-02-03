package com.leetcode.RecursionBasics;

public class PrintNumberRecursion {

    public static void main(String[] args) {

        print(1);
    }

    private static void print(int n) {

        if(n == 5){  // base condition for recursion
            System.out.println(n);
            return;
        }

        System.out.println(n);
        print(n+1); // print method calling itself until the base condition is satisfied.
    }
}
