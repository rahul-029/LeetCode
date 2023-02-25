package com.practice.leetcode;

import java.util.Arrays;

public class MoveZeros {

    public static void main(String[] args) {

        int [] arr = {0,1,0,3,12};
        //moveZeroes(arr);
        moveZereosTwo(arr);
    }

    public static void moveZeroes(int[] nums) {

        int snowBallSize = 0;
        for(int i=0; i < nums.length; i++){
            if(nums[i] == 0){
                snowBallSize++;
            } else if(snowBallSize > 0){
                int temp = nums[i];
                nums[i] = 0;
                nums[i-snowBallSize] = temp;
            }
        }

        System.out.println(Arrays.toString(nums));
    }

    public static void moveZereosTwo(int [] nums){

        int j = nums.length-1;
        for(int i=0; i < j; i++){
            if(nums[i] == 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j--;
            }
        }

        System.out.println(Arrays.toString(nums));
    }
}
