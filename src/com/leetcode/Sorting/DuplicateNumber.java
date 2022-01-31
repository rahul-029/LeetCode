package com.leetcode.Sorting;

//Program to find duplicate numbers in the range 0-N.
public class DuplicateNumber {

    public static void main(String[] args) {

        int [] arr = {4, 0, 1, 4, 3, 2};
        int ans = findDuplicateNumber(arr);
        System.out.println("Duplicate Number is: " +ans);
    }

    private static int findDuplicateNumber(int[] arr) {

        int i = 0;
        while(i < arr.length){

            int correctIndex = arr[i];
            if(arr[i] != arr[correctIndex]){
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            } else {
                i++;
            }
        }

        //search
        for (int index = 0; index < arr.length; index++) {
            if(arr[index] != index){
                return arr[index];
            }
        }

        return -1;
    }
}
