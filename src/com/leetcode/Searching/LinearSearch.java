package com.leetcode.Searching;

public class LinearSearch {
    public static void main(String[] args) {
        int [] arr = {2, 6, 10, 5, 19};
        int targetElement = 11;
        search(arr, targetElement);
    }

    private static int search(int[] arr, int targetElement) {

        for(int i=0; i < arr.length; i++){
            if(targetElement == arr[i]){
                System.out.println("Element found at " + "index: " +i);
            }
        }

        return -1;
    }
}
