package com.practice.leetcode;

public class IndexOfFirstOccurence {
    public static void main(String[] args) {
        String haystack = "sarbutsad";
        String needle = "sad";
        System.out.println(strStr(haystack, needle));

    }

    public static int strStr(String haystack, String needle) {

        int l1 = haystack.length(), l2 = needle.length();
        if (l1 < l2) {
            return -1;
        } else if (l2 == 0) {
            return 0;
        }
        int threshold = l1 - l2;
        for (int i = 0; i <= threshold; ++i) {
            if (haystack.substring(i,i+l2).equals(needle)) {
                return i;
            }
        }
        return -1;
    }

}
