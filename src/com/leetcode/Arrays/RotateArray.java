package com.leetcode.Arrays;

import java.util.Arrays;

// Program to rotate an array - Brute force approach.
public class RotateArray {

    public static void main(String[] args) {

        int [] arr = {1, 2, 3, 4, 5, 6};
        int n = 2;  // Rotate array "n" times. Ex- if n=1, O/P = [6, 1, 2, 3, 4, 5]
                    // if n=3, O/P = [4, 5, 6, 1, 2, 3]

        int [] ans = rotateArray(arr, n);
        System.out.println("Array after rotation: " + Arrays.toString(arr));
    }

    private static int[] rotateArray(int[] arr, int n) {

        //int count = 0;

        for(int i=0; i < n; i++){
            for(int j= arr.length-1; j > 0; j--){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
            }
        }

        return arr;
    }
}
