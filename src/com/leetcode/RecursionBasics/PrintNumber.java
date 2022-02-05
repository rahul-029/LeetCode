package com.leetcode.RecursionBasics;

// Printing numbers, by calling function within a function
public class PrintNumber {

    public static void main(String[] args) {

        print(1);
    }

    private static void print(int i) {
        System.out.println(i);
        print1(2);
    }

    private static void print1(int i) {
        System.out.println(i);
        print2(3);
    }

    private static void print2(int i) {
        System.out.println(i);
        print3(4);
    }

    private static void print3(int i) {
        System.out.println(i);
        print4(5);
    }

    private static void print4(int i) {
        System.out.println(i);

    }
}
