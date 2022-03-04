package com.leetcode.Sorting;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {

        int [] arr = {14, 2, 33, 11, 5};
        System.out.println(Arrays.toString(arr));
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    private static void mergeSort(int[] arr) {

        int length = arr.length;
        int mid = length/2;

        if(length == 1){
            return;
        }

        int [] left = new int[mid];
        int [] right = new int[length - mid];

        for(int i=0; i < mid; i++){
            left[i] = arr[i];
        }

        for(int i=mid; i < length; i++){
            right[i-mid] = arr[i];
        }

        mergeSort(left);
        mergeSort(right);
        merge(arr, left, right);
    }

    private static void merge(int[] ans, int[] left, int[] right) {

        int i = 0;
        int j = 0;
        int k = 0;


        while( i < left.length && j < right.length){
            if(left[i] <= right[j]){
                ans[k] = left[i];
                i++;
            } else {
                ans[k] = right[j];
                j++;
            }

            k++;
        }

        while(i < left.length){
            ans[k] = left[i];
            i++;
            k++;
        }

        while(j < right.length){
            ans[k] = right[j];
            j++;
            k++;
        }

    }

}
