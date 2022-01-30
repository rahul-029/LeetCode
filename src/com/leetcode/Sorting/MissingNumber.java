package com.leetcode.Sorting;

/* Apply cyclic sort to find the missing number */

public class MissingNumber {
    public static void main(String[] args) {

        int [] arr = {4, 1, 0, 3};
        int ans = findMissingNumber(arr);
        System.out.println("Missing number is : " + ans);
    }

    private static int findMissingNumber(int[] arr) {

        int i = 0;
        while(i < arr.length){
            // since, the number range start from "0" , so we are not subtracting "1" to find the correctIndex, coz after sorting array --> [0, 1, 2, 3, 4]
            // So, here arr[0] = 0, arr[1] = 1 and so on.
            int correctIndex = arr[i];
            if(arr[i] < arr.length && arr[i] != arr[correctIndex]){
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            } else{
                i++;
            }
        }

        for(int j=0; j < arr.length; j++){
            if(j != arr[j]){
                return j;
            }
        }

        return arr.length;
    }
}
