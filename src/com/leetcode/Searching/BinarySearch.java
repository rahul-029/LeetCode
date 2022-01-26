package com.leetcode.Searching;

public class BinarySearch {

    public static void main(String[] args) {

        //int [] arr = {-11, -2, 1, 4, 7, 18, 24, 29, 33, 44, 51};
        int [] arr = {51, 44, 33, 29, 24, 18, 7, 4, 1, -2, -11};
        int target = 1;
        int index = binarySearch(arr, target);
        System.out.println(index);
    }

    public static int binarySearch(int [] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        int mid = start + (end - start)/2;

        while(start <= end){

            if(arr[mid] == target){
                return mid;
            }

            if(arr[mid] > target){
                start = mid + 1;
                mid = (start + end)/2;
            }
            else if(arr[mid] < target) {
                end = mid - 1;
                mid = (start + end)/2;
            }
        }

        return -1;
    }
}
