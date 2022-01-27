package com.leetcode.BinarySearch;

import java.util.Arrays;

/** Return the first and last occurence of the target**/
public class FirstLastPosition {

    public static void main(String[] args) {

        int [] arr = {5, 7, 7, 7, 7, 8, 8, 10};
        int target = 8;

        int [] answer = findFirstLastOccurence(arr, target);
        System.out.println(Arrays.toString(answer));

    }

    private static int[] findFirstLastOccurence(int[] arr, int target) {

        int [] ans = {-1, -1};

        /** Apply binary search two times to find the stating index and end index of the target element **/

        int targetStartIndex = search(arr, target, true);
        int targetEndIndex = search(arr, target, false);

        ans[0] = targetStartIndex;
        ans[1] = targetEndIndex;

        return ans;
    }

    public static int search(int [] arr, int target, boolean firstStartingIndex){

        int ans = 0;
        int start = 0;
        int end = arr.length -1;

        while(start <= end){

            int mid = start + (end - start) / 2;

            if(target > arr[mid]){
                start = mid + 1;
            } else if (target < arr[mid]){
                end = mid - 1;
            } else{
                ans = mid;

                /** If firstStartingIndex value is true, that means target element occurrences may be present on the left of mid **/
                if(firstStartingIndex){
                    end = mid - 1;
                } else{
                    start = mid + 1;
                }
            }
        }

        return ans;

    }
}
