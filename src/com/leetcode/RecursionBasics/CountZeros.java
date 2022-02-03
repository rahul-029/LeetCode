package com.leetcode.RecursionBasics;

public class CountZeros {

    public static void main(String[] args) {

        int n = 302040;
        int count = 0;
        int ans = countZeros(n, count);
        System.out.println(ans);
    }

    private static int countZeros(int n, int count) {

        if(n == 0){
            return count;
        }

        int digit = n % 10;
        if(digit == 0){
            return countZeros(n/10, ++count);
        }

        return countZeros(n/10, count);
    }
}
