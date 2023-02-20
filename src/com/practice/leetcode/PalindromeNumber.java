package com.practice.leetcode;

public class PalindromeNumber {

    public static void main(String[] args) {

        int num = 1213;
        int digit = 0;
        int rev = 0;

        while(num != 0){

            digit = num % 10;
            rev = rev*10 + digit;
            num = num/10;
        }

        System.out.println(rev);
    }
}
