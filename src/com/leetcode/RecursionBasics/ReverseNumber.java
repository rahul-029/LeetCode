package com.leetcode.RecursionBasics;

public class ReverseNumber {

    public static void main(String[] args) {

        int n = 5123;
        reverse(n);
        System.out.println(sum);
        System.out.print("Is Number Palindrome: ");
        System.out.print(sum == n); // Expression to evaluate if the number is palindrome.
    }

    static int sum = 0;

    private static void reverse(int n) {

        if(n == 0){
            return;
        }
        int digit = n % 10;
        sum = sum * 10 + digit;

        reverse(n/10); // Not exactly pure recursion as we are using an external variable "sum".
    }
}
