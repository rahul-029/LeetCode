package com.leetcode.BinarySearch;

// Find element in a biotonic array, Ex- if target = 3, it occurs two times, return the minimum index of the target.

public class MountainPeakTwo {

    public static void main(String[] args) {

        int [] arr = { 1, 2, 3, 4, 5, 3, 1 };
        int target = 8;

        int ans = findTarget(arr, target);
        System.out.println("Target found at index: " + ans);
    }

    private static int findTarget(int[] arr, int target) {

        int start = 0;
        int end = arr.length -1;

        while(start < end){

            int mid = start + (end - start) / 2;

            if(arr[mid] > arr[mid +1]){
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return binarySearch(arr, target, end);
    }

    private static int binarySearch(int[] arr, int target, int end) {

        int start = 0;

        while (start <= end){

            int mid = start + (end - start) / 2;

            if(arr[mid] == target){
                return mid;
            } else if(target > arr[mid]){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }
}
