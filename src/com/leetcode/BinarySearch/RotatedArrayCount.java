package com.leetcode.BinarySearch;

// Program to count the number of times the array is rotated.
public class RotatedArrayCount {

    public static void main(String[] args) {

        int [] arr = {4, 5, 1, 2};
        int pivot = findPivot(arr);  // Find the pivot
        System.out.println("No of times the array is rotated: " + pivot); // the index of pivot determines the number of times array is rotated.
    }

    private static int findPivot(int[] arr) {

        int start = 0;
        int end = arr.length -1;

        while(start < end){

            int mid = start + (end - start) / 2;

            if(arr[mid] > arr[mid+1]){
                start = mid + 1;
            } else{
                end = mid;
            }
        }

        return start;
    }
}
