package com.leetcode.Arrays;

public class UniqueElement {

    public static void main(String[] args) {
        int [] arr = {1, 3, 4, 3, 1};
        int uniqueElement = findUniqueElement(arr);
        System.out.println(uniqueElement);
    }

    private static int findUniqueElement(int[] arr) {
         int ans = 0;
         for(int i=0; i<arr.length; i++){
             ans = ans ^ arr[i];
         }

         return ans;
    }
}
