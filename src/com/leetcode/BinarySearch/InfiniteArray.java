package com.leetcode.BinarySearch;

/** Find the position of an element in an infinite sorted array. **/

public class InfiniteArray {

    public static void main(String[] args){

        int [] arr = {2, 3, 5, 6, 7, 8, 10, 11, 12, 15, 21, 23, 30, 35, 55};
        int target = 15;
        int ans = findIndex(arr, target);
        System.out.println("Target found at index: " +ans);
    }

    private static int findIndex(int[] arr, int target) {

        int start = 0;
        int end = 1;

        while(target > arr[end]){
            int newStart =  end + 1; // Taking a new variable to store start as we need to use the initial value of start for the first iteration before we update it.
            end = end + (end - start + 1) * 2 ; // Ex- end = 1, start = 0. Need to increase size by size*2, So, end - start + 1, we add one for the index.
            start = newStart;
        }

        return (binarySearch(arr, target, start, end));

    }

    private static int binarySearch(int[] arr, int target, int start, int end) {

        while (start <= end){

            int mid  = (start + end) / 2;

            if(target > arr[mid]){
                start = mid + 1;
            } else  if(target < arr[mid]){
                end = mid - 1;
            } else{
                return mid;
            }
        }

        return 0;
    }
}
