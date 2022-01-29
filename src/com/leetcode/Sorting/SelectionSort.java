package com.leetcode.Sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {

        int [] arr = {5, 4, 3, 2, 1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    /* In SelectionSort -- we select the maximum or the minimum number from the array or list and put it at their appropriate position.
    *  In the first pass, for the above array - we find the max number and swap it with the last index -- array becomes [3, 2, 1, 4, 5]
    *  In the second pass, we find the max for the remaining elements and swap with last index (arr.length - i -1) -- array becomes [3, 2, 1, 4, 5,]
    *  As, 4 is already at its correct position, so no swaps required....we keep swapping until the list is sorted. */
    private static void selectionSort(int[] arr) {

        for(int i=0; i < arr.length; i++){

            int last = arr.length - i -1;
            int maxIndex = findMax(arr, last);

            int temp = arr[maxIndex];
            arr[maxIndex] = arr[last];
            arr[last] = temp;
        }
    }

    private static int findMax(int[] arr, int last) {

        int max = 0;
        for(int i=1; i <= last; i++){
            if(arr[i] > arr[max]){
                max = i;
            }
        }

        return max;
    }
}
