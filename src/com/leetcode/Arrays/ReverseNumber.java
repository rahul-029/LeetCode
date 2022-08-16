package com.leetcode.Arrays;

public class ReverseNumber {

    public static void main(String[] args) {

        int num = 369;
        int digit = 0;
        int rev = 0;

        while(num != 0){
            digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }

        System.out.println(rev);
    }
}
