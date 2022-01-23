package com.leetcode.Arrays;

import java.util.Arrays;

public class BuildArray {
    public static void main(String[] args) {
        int [] arr = { 0,2,1,5,3,4};

        int [] newArray = new int[arr.length];

        for(int i=0; i < arr.length; i++){
            newArray[i] = arr[arr[i]];
        }

        System.out.println("New Array is: " + Arrays.toString(newArray));

    }
}
