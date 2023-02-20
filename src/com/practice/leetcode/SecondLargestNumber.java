package com.practice.leetcode;

public class SecondLargestNumber {

    public static void main(String[] args) {

        int arr[] = {10, 1, 13, 8, 11};
        int largest = 0;
        int secondLargest = 0;

        for(int i=0; i < arr.length; i++){
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            } else if(arr[i] > secondLargest){
                secondLargest = arr[i];
            }
        }

        System.out.println(secondLargest);
    }
}
