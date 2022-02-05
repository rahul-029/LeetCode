package com.leetcode.RecursionSorting;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {

        int [] arr = {5, 4, 3, 2, 1};
        int [] ans = mergeSort(arr);
        System.out.println(Arrays.toString(ans));

    }

    private static int[] mergeSort(int[] arr) {

        if(arr.length == 1){
            return arr;
        }
        int mid  = arr.length/2;

        int [] leftArray = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int [] rightArray = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(leftArray, rightArray);
    }

    private static int[] merge(int[] leftArray, int[] rightArray) {

        int [] finalArray = new int[leftArray.length + rightArray.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while(i < leftArray.length && j < rightArray.length){
            if(leftArray[i] < rightArray[j]){
                finalArray[k] = leftArray[i];
                i++;
            } else {
                finalArray[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // If there left over elements in any of arrays that we are trying to merge
        // Then, add the remaining elements to the final Array.

        while(i < leftArray.length){
            finalArray[k] = leftArray[i];
            i++;
            k++;
        }

        while(j < rightArray.length){
            finalArray[k] = rightArray[j];
            j++;
            k++;
        }

        return finalArray;
    }
}
