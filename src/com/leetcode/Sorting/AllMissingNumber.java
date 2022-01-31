package com.leetcode.Sorting;

import java.util.ArrayList;
import java.util.List;

// Program to find all missing numbers in a range 1 - N.
public class AllMissingNumber {

    public static void main(String[] args) {

        int [] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> missingNumbers = findAllMissingNumbers(arr);
        System.out.println(missingNumbers);
    }

    private static List<Integer> findAllMissingNumbers(int[] arr) {

        List<Integer> missingNumbers = new ArrayList<>();
        int i = 0;
        while(i < arr.length){

            int correctIndex = arr[i] - 1;
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
            if(arr[index] != index+1){
                missingNumbers.add(index+1);
            }
        }

       return  missingNumbers;
    }
}
