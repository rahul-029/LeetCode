package com.leetcode.Practice;

public class SecondLargest {

    public static void main(String[] args) {

        int arr[] = {10, 1, 5, 8, 11};
        int secondLargest = 0;
        int largest = 0;

        for(int i=0; i < arr.length; i++){

            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            } else if(arr[i] > secondLargest){
                secondLargest = arr[i];
            }
        }

        System.out.println(secondLargest);
        System.out.println(largest);
    }
}
