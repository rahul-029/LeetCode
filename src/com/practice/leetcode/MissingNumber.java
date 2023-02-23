package com.practice.leetcode;

public class MissingNumber {

    public static void main(String[] args) {
        int[] arr = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNum(arr));
    }

    private static int missingNum(int[] arr) {

        int sum = 0;
        for(int i : arr){
            sum = sum + i;
        }

        return (arr.length * (arr.length + 1)) / 2 - sum;
    }

}
