package com.leetcode.Arrays;

import java.util.Arrays;

public class ShuffleArray {
    public static void main(String[] args) {
        int [] arr = {2,5,1,3,4,7};
        int n = 3;

        int [] newArray = new int[n*2];
        int start = 0;
        int end = n;

        // increment for loop by 2 coz in one iteration, we need to insert two elements.
        for(int i=0; i < arr.length; i=i+2){

            newArray[i] = arr[start];
            newArray[i + 1] = arr[end];

            start++;
            end++;
        }

        System.out.println("Array after shuffling: " + Arrays.toString(newArray));

    }
}
