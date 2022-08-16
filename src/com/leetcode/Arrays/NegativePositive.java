package com.leetcode.Arrays;

import java.util.Arrays;

public class NegativePositive {

    public static void main(String[] args) {

        int [] arr = {-1, 2, -3, 4, 5, 6, -7, 8, 9};
        int pivot = 0;
        int i = -1;

        for (int j = 0; j < arr.length; j++) {
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
