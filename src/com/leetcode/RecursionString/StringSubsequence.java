package com.leetcode.RecursionString;

public class StringSubsequence {

    public static void main(String[] args) {

        String originalString = "abc";
        String pick = "";
        findSubsets(pick, originalString);
    }

    private static void findSubsets(String pick, String originalString) {

        if(originalString.isEmpty()){
            System.out.print(pick + " ");
            return;
        }

        char ch = originalString.charAt(0);
        findSubsets(pick + ch, originalString.substring(1));
        findSubsets(pick, originalString.substring(1));
    }
}
