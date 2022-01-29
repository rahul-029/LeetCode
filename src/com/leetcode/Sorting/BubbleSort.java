package com.leetcode.Sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int [] arr = {1, 2, 3, 4, 5};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleSort(int[] arr) {

        boolean swapped = false;
        for(int i=0; i < arr.length; i++){
            for(int j=1; j < arr.length - i; j++){  // 2nd loop runs till arr.length - i, because at every pass, max element will be at the end.

                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }

            if(!swapped){ // if list is already sorted, there will be no swaps, hence, swapped = false and will break out of the loop
                break;
            }

        }
    }
}
