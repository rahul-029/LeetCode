package com.leetcode.RecursionBasics;

public class PrintNto1 {

    public static void main(String[] args) {

        int n = 5;
        printNToOne(n);
        /*printOneToN(n);
        printBoth(n);*/
    }

    // prints --> 5  4  3  2  1
    private static void printNToOne(int n) {

        if(n==0){
            return;
        }
        System.out.println(n);
        printNToOne(n-1);
    }

    // prints --> 1  2  3  4  5
    private static void printOneToN(int n) {

        if(n==0){
            return;
        }
        printOneToN(n-1); // first all calls will go to the stack memory, while coming out it will start printing.
        System.out.println(n);
    }

    // prints 5  4  3  2  1  1  2  3  4  5
    private static void printBoth(int n) {

        if(n==0){
            return;
        }
        System.out.println(n);
        printBoth(n-1);
        System.out.println(n);
    }
}
