package com.practice.leetcode;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacter {

    public static void main(String[] args) {

        String str = "pwwkew";
        System.out.println(lengthOfLongestSubstring(str));
    }

    private static int lengthOfLongestSubstring(String str) {

        int i = 0;
        int j = 0;
        int count = 0;
        Set<Character> unique = new HashSet<>();

        while(i < str.length() && j < str.length()){

            if(!unique.contains(str.charAt(i))){
                unique.add(str.charAt(i));
                i++;
                count = Math.max(count, i-j);
            } else {
                unique.remove(str.charAt(j));
                j++;
            }
        }

        return count;
    }
}
