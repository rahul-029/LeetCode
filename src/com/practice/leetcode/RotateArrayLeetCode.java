package com.practice.leetcode;

import java.util.Arrays;

public class RotateArrayLeetCode {

    public static void main(String[] args) {

        int [] arr = {1, 2, 3, 4, 5, 6, 7}; // 6, 7, 1, 2, 3, 4, 5
        int n = 3;


        arr = reverseArray(arr, 0, arr.length-1);
        arr = reverseArray(arr, 0, n-1);
        arr = reverseArray(arr, n, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] reverseArray(int[] arr, int start, int end) {

        while(start < end ){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        return arr;
    }


}
