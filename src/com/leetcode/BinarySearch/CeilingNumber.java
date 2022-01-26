package com.leetcode.BinarySearch;

/* Ceiling of a number is the number which is the smallest number greater than or equal to the target number.
* ex- {2,3,5,9,14,16,18}  here, if target = 9, ceiling = 9 or if target = 15, ceiling = 16*/
public class CeilingNumber {

    public static void main(String[] args) {
        int arr[] = {2,3,5,9,14,16,18};
        int target = 18;
        int ans = findCeilingNumber(arr, target);
        System.out.println("Ceiling of the number: " + ans);
    }

    private static int findCeilingNumber(int[] arr, int target) {
        int start = 0;
        int end = arr.length -1;


        while(start < end) {
            int mid = (start + end)/2;
            if (arr[mid] == target) {
                return arr[mid];
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return arr[start];
    }
}
