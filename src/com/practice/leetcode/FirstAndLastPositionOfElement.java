package com.practice.leetcode;

import java.util.Arrays;

public class FirstAndLastPositionOfElement {

    public static void main(String[] args) {
         int[] arr = {5,7,7,8,8,10};
         int target = 6;
         System.out.println(Arrays.toString(searchRange(arr, target)));
    }

    private static int [] searchRange(int[] arr, int target) {

        int [] nums = {-1, -1};

        int firstOccurence = search(arr, target, true);
        int lastOccurence = search(arr, target, false);

        nums[0] = firstOccurence;
        nums[1] = lastOccurence;

        return nums;
    }

    private static int search(int[] arr, int target, boolean firstIndex) {

        int start = 0;
        int end = arr.length-1;
        int ans = -1;

        while(start <= end){
             int mid = start + (end - start) / 2;

             if(arr[mid] < target){
                 start = mid + 1;
             } else if(arr[mid] > target){
                 end = mid -1;
             } else {
                 ans = mid;

                 if(firstIndex){
                     end = mid -1;
                 } else {
                     start = mid + 1;
                 }
             }
        }

        return ans;
    }
}
