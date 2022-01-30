package com.leetcode.Sorting;

import java.util.Arrays;

public class CyclicSort {

    public static void main(String[] args) {

        int [] arr = {4, 3, 1, 5, 2};

        /* We apply cyclicSort on distinct continuous elements which are in range 1 to N.
         * In this, we check if the index at which the element is present is correct or not.
         * Correct Index of an element will be [elementValue - 1]. for ex - CorrectIndex of 4 is [4-1 = 3], so we check if
         * index of 4 is its correctIndex or not, if not -- > we swap it with its correct index. So, here
         * index of 4 is [0] which is not its correctIndex[4-1 = 3], So, we swap arr[0] with arr[3]. --> [5, 3, 1, 4, 2]
         * Next, we have 5 at [0] correctIndex[5-1 = 4], So, we swap arr[0] with arr[4]. --> [2, 3, 1, 4, 5]
         * Next, we have 2 at [0] correctIndex[2-1 = 1], So, we swap arr[0] with arr[1]. --> [3, 2, 1, 4, 5]
         * Next, we have 3 at [0] correctIndex[3-1 = 2], So, we swap arr[0] with arr[2]. --> [1, 2, 3, 4, 5] -- sorted, break the loop.*/
        cycleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void cycleSort(int[] arr) {

        int i = 0;
        while(i < arr.length){

            int correctIndex = arr[i] - 1;   // We determine the correctIndex of the element
            if(arr[i] != arr[correctIndex]) {  // if the value at the correctIndex is not equals to arr[i], then swap, else i++
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            } else {
                i++;
            }
        }
    }
}
