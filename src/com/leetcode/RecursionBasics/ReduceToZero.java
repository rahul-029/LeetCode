package com.leetcode.RecursionBasics;

/* Reduce a given number to 0.
 * Ex: N = 14
 * Step 1: If number is even divide by 2, obtain 7
 * Step 2: 7 is odd, subtract 1, obtain 6
 * Step 3: 6 is even, divide by 2, obtain 3
 * Step 4: 3 is odd, subtract 1, obtain 2
 * Step 5: 2 is even, divide by 2, obtain 1
 * Step 6: 1 is odd, subtract 1, obtain 0.
 * Answer is 6 */
public class ReduceToZero {

    public static void main(String[] args) {

        int n = 14;
        int count = 0;
        int ans = reduceNumberToZero(n, count);
        System.out.println("Reduced to zero in " +ans+ " steps.");
    }

    private static int reduceNumberToZero(int n, int count) {

        if(n == 0){
            return count;
        }

        if(n % 2 == 0){
            return reduceNumberToZero(n/2, count+1);
        }
        return reduceNumberToZero(n-1, count+1);
    }
}
