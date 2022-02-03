package com.leetcode.RecursionBasics;

public class Concept {

    public static void main(String[] args) {

        int n = 5;
        fun(n);
    }

    private static void fun(int n) {

        if(n == 0){
            return;
        }

        System.out.println(n);
        //fun(n--);
        fun(--n);

        // n-- vs --n
        // n-- means pass the value of n and then subtract it. So it will keep passing n and will result in StackOverflow,
        // --n means subtract the value of n first before passing.
    }
}
