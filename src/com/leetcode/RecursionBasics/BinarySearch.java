package com.leetcode.RecursionBasics;

public class BinarySearch {

    public static void main(String[] args) {

        int [] arr = {10, 13, 15, 66, 77, 88};
        int target = 66;
        int ans = binarySearchRecursion(arr, target, 0, arr.length-1);
        System.out.println(ans);
    }

    private static int binarySearchRecursion(int[] arr, int target, int start, int end) {

        int mid = start + (end - start) / 2;

        if(target == arr[mid]){
            return mid;
        }

        if(target > arr[mid]){
            return binarySearchRecursion(arr, target, mid + 1, end);
        } else {
            return binarySearchRecursion(arr, target, start, mid - 1);
        }
    }
}
