package com.leetcode.Arrays;

public class SecondSmallest {

    public static void main(String[] args) {

        int [] arr = {10, 5, 15, 6, 7};
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for(int i=0; i < arr.length; i++){
            if(arr[i] < smallest){
                secondSmallest = smallest;
                smallest = arr[i];
            } else if(arr[i] < secondSmallest && secondSmallest != smallest){
                secondSmallest = arr[i];
            }

        }

        System.out.println(smallest);
        System.out.println(secondSmallest);
    }
}
