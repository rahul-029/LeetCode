package com.practice.leetcode;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicateElementsInPlace {

    public static void main(String[] args) {

        int[] arr = {0, 0, 1, 1, 3, 3, 4, 6, 7};
        //System.out.println(removeDuplicateElements(arr));
        System.out.println(removeDuplicateElementsUsingMap(arr));
    }

    private static Map removeDuplicateElementsUsingMap(int[] arr) {

        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i < arr.length; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            } else {
                map.put(arr[i], 1);
            }
        }

        return map;
    }

    private static int removeDuplicateElements(int[] arr) {

        int startIndex = 1;
        for(int i=1; i < arr.length; i++){
            if(arr[i-1] != arr[i]){
                arr[startIndex] = arr[i];
                startIndex++;
            }
        }

        return startIndex;
    }
}
