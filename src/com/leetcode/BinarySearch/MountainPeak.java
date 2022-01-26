package com.leetcode.BinarySearch;

public class MountainPeak {

    public static void main(String[] args) {
        int [] arr = { 1, 3, 5, 6, 7, 6, 5, 3, 2, 1 };
        int ans = findPeakIndex(arr);
        System.out.println("Peak Element is: " + arr[ans]);
    }

    private static int findPeakIndex(int[] arr) {

        int start = 0;
        int end = arr.length -1;

        while(start < end){

            int mid = (start + end) / 2;
            if(arr[mid] < arr[mid+1]){
                start = mid + 1;
            } else{
                end = mid;
            }
        }

        return start;
    }
}
