package com.leetcode.Practice;

import java.util.*;

public class Program3 {

    public static void main(String[] args) {
        int [] arr = {4, 3, 1, 5, 2};

        int [] ans = cyclicSort(arr);
        System.out.println(Arrays.toString(ans));

    }

    private static int[] cyclicSort(int[] arr) {

        int i = 0;

        while(i < arr.length){
            int correctedIndex = arr[i] -1;
            if(arr[i] != arr[correctedIndex]){
                int temp = arr[i];
                arr[i] = arr[correctedIndex];
                arr[correctedIndex] = temp;
            } else {
                i++;
            }
        }

        return arr;
    }
}
