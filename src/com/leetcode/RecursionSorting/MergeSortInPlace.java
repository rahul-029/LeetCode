package com.leetcode.RecursionSorting;

import java.util.Arrays;

public class MergeSortInPlace {

    public static void main(String[] args) {

        int [] arr = {5, 4, 3, 2, 1};
        inPlaceMergeSort(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    private static void inPlaceMergeSort(int[] arr, int start, int end) {

        if(end - start == 1){
            return;
        }
        int mid = start + (end - start) / 2;

        inPlaceMergeSort(arr, start, mid);
        inPlaceMergeSort(arr, mid, end);

        merge(arr, start, mid, end);

    }

    private static void merge(int[] arr, int start, int mid, int end) {

        int [] finalArray = new int[end - start];
        int i = start;
        int j = mid;
        int k = 0;

        while(i < mid && j < end){
            if(arr[i] < arr[j]){
                finalArray[k] = arr[i];
                i++;
            } else{
                finalArray[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i < mid){
            finalArray[k] = arr[i];
            i++;
            k++;
        }

        while(j < end){
            finalArray[k] = arr[j];
            j++;
            k++;
        }

        //copy all the values of finalArray to the original array.
        for(int a=0; a < finalArray.length; a++){
            arr[start+a] = finalArray[a];
        }
    }
}
