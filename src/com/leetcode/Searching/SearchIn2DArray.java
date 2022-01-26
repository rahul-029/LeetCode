package com.leetcode.Searching;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {

        int [][] arr = {
                {2, 15},
                {4, 88, 56, 11},
                {5, 19, 29},
                {3, 39}
        };

        int target = 88;
        System.out.println(search(arr, target));
        int [] ans= searchIndex(arr, target);
        System.out.println(Arrays.toString(ans));

        int max = findMax(arr);
        System.out.println(max);
    }

    private static int findMax(int[][] arr) {
        int max = arr[0][0];
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                if(arr[row][col] > max){
                    max = arr[row][col];
                }
            }
        }

        return max;

    }

    private static int[] searchIndex(int[][] arr, int target) {

        if(arr.length == 0) {
            return new int[] {-1, -1};
        }

        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                if(arr[row][col] == target){
                    return new int[] {row, col};
                }
            }
        }

        return new int[]{-1, -1};
    }

    private static boolean search(int[][] arr, int target) {

        if(arr.length == 0){
            return false;
        }

        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                if(arr[row][col] == target){
                    return true;
                }
            }
        }

        return false;
    }
}
