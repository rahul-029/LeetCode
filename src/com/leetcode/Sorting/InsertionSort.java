package com.leetcode.Sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {

        int [] arr = {3, 2, 5, 4, 1};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    /* In Insertion sort, we take parts of the array and keep sorting them until the array is completely sorted.
    *  We start with index (i, j) i.e [3, 2] where i = 0, j = i+1, if arr[j] < arr[j-1], swap the elements, j--,  j=0 break the loop, Array becomes [2, 3, 5, 4, 1]
    *  Next, iteration i becomes 1, j = 2, i.e [2, 3, 5]  arr[j] < arr[j-1], no swaps needed, j-- , j=1 arr[j] < a[j-1], no swaps needed, j--,  j=0 break the loop, Array becomes [2, 3, 5, 4, 1]
    *  Next iteration i becomes 2, j = 3, i.e [2, 3, 5, 4] arr[j] < arr[j-1], swap elements, j--, j= 2, array - [2, 3, 4, 5],
    *  arr[j] < a[j-1] no swaps, j--, j=1  arr[j] < a[j-1] no swaps, j--, j=0, break the loop, array - [2, 3, 4, 5, 1]
    *  Next iteration i becomes 3, j = 4, since arr[j]=1, it will keep swapping till j = 0 break the loop, array - [1, 2, 3, 4, 5]
    *  We should run the outer loop i till arr.length - 2, in this case its 5-2 = 3, because, if i becomes 4, j= i+1 = 5, which will give IndexOutOfBounds*/

    private static void insertionSort(int[] arr) {

        for(int i=0; i < arr.length - 1; i++){  // here we can also write i <= arr.length - 2
            for(int j= i+1; j > 0; j--){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
}
