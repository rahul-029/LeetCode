package com.leetcode.Searching;

public class SearchInRange {
    public static void main(String[] args) {
        int [] arr = {5, 6, 10, 1, 19, 29};
        int start = 1;
        int end = 4;
        int target = 1;

        System.out.println(search(arr, start, end, target));
    }

    private static boolean search(int[] arr, int start, int end, int target) {

        if(arr.length == 0){
            return false;
        }

        for(int i = start; i < end; i++){
            if(arr[i] == target){
                return true;
            }
        }

        return  false;
    }
}
