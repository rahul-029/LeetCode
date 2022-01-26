package com.leetcode.Searching;

public class SearchInStrings {

    public static void main(String[] args) {
        String s = "Rahul";
        char target = 'o';

        boolean isTargetPresent = search(s, target);
        if(isTargetPresent){
            System.out.println("Target found in the string");
        } else{
            System.out.println("Target not found");
        }
    }

    private static boolean search(String s, char target) {

        char [] arr = s.toCharArray();

        if(arr.length == 0){
            return false;
        }
        for(char r: arr){
            if(r == target){
                return true;
            }
        }

        return  false;
    }
}
