package com.leetcode.Arrays;

//How Many Numbers Are Smaller Than the Current Number

/*Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it.
That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].
        Return the answer in an array.
        Example 1:

        Input: nums = [8,1,2,2,3]
        Output: [4,0,1,1,3]
        Explanation:
        For nums[0]=8 there exist four smaller numbers than it (1, 2, 2 and 3).
        For nums[1]=1 does not exist any smaller number than it.
        For nums[2]=2 there exist one smaller number than it (1).
        For nums[3]=2 there exist one smaller number than it (1).
        For nums[4]=3 there exist three smaller numbers than it (1, 2 and 2).*/

import java.util.Arrays;

public class SmallerThanCurrent {
    public static void main(String[] args) {
        int [] arr = {6,5,4,8};

        int [] result = findSmallerThanCurrent(arr);
        System.out.println(Arrays.toString(result));
    }

    private static int[] findSmallerThanCurrent(int[] arr) {

        int [] resultantArray = new int[4];
        int count = 0;
        for(int i=0; i < arr.length; i++){
            for(int j=arr.length-1; j >= 0; j--){  // Yahan 2nd for loop ulta chalega, so that we can compare with all elements.
                if(arr[i] != arr[j] && arr[i] > arr[j]){
                    count++;
                }
            }
            resultantArray[i] = count;
            count = 0;
        }

        return resultantArray;
    }
}
