package com.leetcode.Arrays;

import java.util.Arrays;

public class RotateArrayOptimized {

    public static void main(String[] args) {

        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int n = 2;

        // Lets say, we need to rotate the elements by n times and n=2. So output should be [7, 8, 1, 2, 3, 4, 5, 6]
        // 1st step -- Reverse the array, array becomes --> [8, 7, 6, 5, 4, 3, 2, 1]
        // 2nd step -- Reverse first "n" elements, i.e "8, 7", array becomes --> [7, 8, 6, 5, 4, 3, 2, 1]
        // final step -- Reverse the rest "n-k" elements, "6, 5, 4, 3, 2, 1", array becomes --> [7, 8, 1, 2, 3, 4, 5, 6]

        int [] ans = rotateArray(arr, n);
        System.out.println("Array after " + n + " rotations: " + Arrays.toString(ans));
    }



    private static int[] rotateArray(int[] arr, int n) {

        int length = arr.length;

        if(n > length){
            return new int[] {-1};
        }

        arr = reverseArray(arr, 0, length-1);
        arr = reverseArray(arr, 0, n-1);
        arr = reverseArray(arr, n, length-1);

        return arr;
    }

    private static int[] reverseArray(int[] arr, int start, int end) {

        while(start <= end){

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        return arr;
    }
}
