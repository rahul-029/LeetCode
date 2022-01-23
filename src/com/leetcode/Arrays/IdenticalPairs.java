package com.leetcode.Arrays;

public class IdenticalPairs {
    public static void main(String[] args) {
        int [] arr = {1,2,3,1,1,3};

        int noOfPairs = findIdenticalpairs(arr);
        System.out.println("No of identical pairs: " + noOfPairs);
    }

    private static int findIdenticalpairs(int[] arr) {
        int count = 0;
        for(int i=0; i< arr.length; i++){
            for(int j=i+1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
        }

        return count;
    }
}
