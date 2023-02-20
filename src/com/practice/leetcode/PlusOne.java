package com.practice.leetcode;

import java.util.Arrays;

public class PlusOne {

    public static void main(String[] args) {

        int [] nums = {1,2,3,4};
        System.out.println(Arrays.toString(plusOne(nums)));
    }

    private static int[] plusOne(int[] nums) {

        int n = nums.length;
        for(int i = n-1; i >= 0; i--){
            if(nums[i] < 9){
                nums[i]++;
                return nums;
            }
        }

        int[] ans = new int[n+1];
        ans[0] =1;

        return ans;
    }
}
