package com.leetcode.BinarySearch;

// Search an element in a sorted rotated array.
public class SearchRotatedArray {

    public static void main(String[] args) {

        int [] arr = {3, 4, 5, 6, 0, 1, 2};
        int target = 2;
        int pivotIndex = findPivot(arr, target);  // finding the pivot, smallest number
        System.out.println( "Pivot Index is: " + pivotIndex);
        
        int start = 0;
        int end = arr.length -1;
        if(arr[0] <= target && target >= arr[pivotIndex]){
            // if the target is greater than arr[0] and arr[pivot], then we need to look in the left array, i.e [3, 4, 5, 6]
            // Hence, end = pivot -1
            end = pivotIndex - 1;
        } else{
            start = pivotIndex; // else we need to look at right array, i.e [0, 1, 2]
        }
        
        int ans = binarySearch(arr, target, start, end); // Once we finalize our search space(start and end index), apply binary search.
        System.out.println("Target index is: " +ans);
    }

    private static int binarySearch(int[] arr, int target, int start, int end) {

        while(start <= end){
            int mid = (start + end) / 2;

            if(arr[mid] == target){
                return mid;
            }

            if(arr[mid] > target){
                end = mid - 1;

            } else {
                start = mid + 1;

            }
        }

        return start;
    }

    private static int findPivot(int[] arr, int target) {

        int start = 0;
        int end = arr.length -1;

        while (start < end){

            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid + 1]){
                start = mid + 1;
            } else{
                end = mid;
            }
        }

        return start;
    }
}
