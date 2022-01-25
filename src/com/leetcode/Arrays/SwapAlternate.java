package com.leetcode.Arrays;

import java.util.Arrays;

// output should be : {2, 1, 4, 3, 6, 5}
public class SwapAlternate {

    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5, 6};

        swapAlternateElements(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void swapAlternateElements(int[] arr) {

        for(int i=0; i < arr.length; i+=2){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
    }
}
