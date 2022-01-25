package com.leetcode.Arrays;

/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

        You may assume that each input would have exactly one solution, and you may not use the same element twice.

        You can return the answer in any order.



        Example 1:

        Input: nums = [2,7,11,15], target = 9
        Output: [0,1]
        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
        Example 2:

        Input: nums = [3,2,4], target = 6
        Output: [1,2]
        Example 3:

        Input: nums = [3,3], target = 6
        Output: [0,1]*/

import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {
        int [] arr = {2,5,5,11};
        int target = 10;

        int[] indices = twoSum(arr, target);
        System.out.println(Arrays.toString(indices));
    }

    private static int[] twoSum(int[] arr, int target) {

        int sum = 0;
        for(int i=0; i < arr.length; i++){
            for(int j=i+1; j < arr.length; j++){
                sum = arr[i] + arr[j];
                if(sum == target){
                    return new int[] {i, j};
                }
            }

            sum = 0;
        }

        return new int[] {-1, -1};
    }
}
