package com.leetcode.BinarySearch;

public class Floor {

    public static void main(String[] args) {

        int [] arr = {2, 5, 7, 10, 14, 19, 21, 34, 55};
        int target = 29;

        int ans = floor(arr, target);
        System.out.println("Floor of the target is: " + ans);
    }

    private static int floor(int[] arr, int target) {

        int start = 0;
        int end = arr.length -1;

        while(start <= end){

            int mid = start + (end - start) / 2;

            if(arr[mid] == target){
                return arr[mid];
            }

            if(arr[mid] > target){
                end = mid - 1;
            } else if(arr[mid] < target){
                start = mid + 1;
            }
        }

        return arr[end];
    }
}
