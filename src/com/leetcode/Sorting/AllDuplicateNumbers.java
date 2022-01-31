package com.leetcode.Sorting;

import java.util.ArrayList;
import java.util.List;


//Program to find all duplicate numbers in the range 1-N.
public class AllDuplicateNumbers {
    public static void main(String[] args) {

        int [] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> duplicateNumbers = findAllDuplicateNumbers(arr);
        System.out.println(duplicateNumbers);
    }

    private static List<Integer> findAllDuplicateNumbers(int[] arr) {

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

        List<Integer> duplicateNumbers = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if(arr[index] != index+1){
                duplicateNumbers.add(arr[index]);
            }
        }

        return duplicateNumbers;
    }
}
