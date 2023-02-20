package com.practice.leetcode;

import java.util.Arrays;

public class LongestCommonPrefix {

    public static void main(String[] args) {

        String[] strs = {"dog","racecar","car"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {


        Arrays.sort(strs);
        int c = 0;
        String first = strs[0];
        String last = strs[strs.length - 1];
        while(c < first.length() && first.charAt(c) == last.charAt(c)){
            c++;
        }

        return (c == 0) ? "": first.substring(0, c);
    }
}
