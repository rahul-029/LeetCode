package com.leetcode.Arrays;

import java.util.Arrays;

public class RunningSum {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};

        int [] runSum = new int[arr.length];
        int sum = 0;

        for(int i=0; i< arr.length; i++){
            sum = sum + arr[i];
            runSum[i] = sum;
        }

        System.out.println("Running sum Array: " + Arrays.toString(runSum));
    }
}
