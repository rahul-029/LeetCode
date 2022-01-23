package com.leetcode.Arrays;

import java.util.Arrays;

public class ConcatArray {

    public static void main(String[] args) {

        int [] arr = {1,2,1};
        int n = arr.length;
        int [] newArray = new int[n*2];

        for(int i=0; i < n; i++){
            newArray[i] = arr[i];
            newArray[i + n] = arr[i];
        }

        System.out.println("New Array is: " + Arrays.toString(newArray));
    }
}
