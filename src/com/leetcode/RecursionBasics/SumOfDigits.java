package com.leetcode.RecursionBasics;

public class SumOfDigits {

    public static void main(String[] args) {

        int n = 6342;
        int ans = sum(n);
        System.out.println(ans);
    }

    private static int sum(int n) {

        if(n == 0){
            return 0;
        }

        int digit = n % 10;
        return digit + sum(n/10);
    }
}
