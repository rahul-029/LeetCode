package com.practice.leetcode;

import java.util.HashMap;

public class ContainsDuplicateInteger {


    public static void main(String[] args) {

        int [] nums = {1, 2, 3, 4};
        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {

        boolean duplicate = false;
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i < nums.length; i++){

            if(!map.containsKey(nums[i])){
                map.put(nums[i], count+1);
            } else {
                duplicate = true;
            }
        }

        return duplicate;
    }
}
