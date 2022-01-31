package com.leetcode.Sorting;

import java.util.Arrays;

// Program to find a number which occurs twice and the missing number and return them in the form of array.
// Apply Cyclic Sort
public class SetMismatch {

    public static void main(String[] args) {

        int [] arr = {2, 1, 4, 2, 6, 5};
        int [] ans = findMismatchNumbers(arr);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] findMismatchNumbers(int[] arr) {

        int i = 0;
        while (i < arr.length){

            int correctIndex = arr[i] - 1;
            if(arr[i] != arr[correctIndex]){
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            } else {
                i++;
            }
        }

        for (int index = 0; index < arr.length; index++) {
            if(arr[index] != index+1){
                return new int[] {arr[index], index +1};
            }
        }

        return  new int[] {-1, -1};
    }
}
