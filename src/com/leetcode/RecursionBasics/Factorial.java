package com.leetcode.RecursionBasics;

// Find factorial of a number
public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        int ans = fact(n);
        System.out.println(ans);
    }

    private static int fact(int n) {

        if(n <= 1){
            return 1;
        }

        return n * fact(n-1);
    }
}
