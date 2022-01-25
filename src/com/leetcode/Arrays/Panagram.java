package com.leetcode.Arrays;

import java.util.*;

public class Panagram {

    public static void main(String[] args) {

        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        boolean isPanagram = checkIfPangram(sentence);
        System.out.println("Is the String Pangram: " +isPanagram);
    }

    private static boolean checkIfPangram(String sentence) {

        Set<Character> sentenceWithoutDuplicates = new HashSet<>();
        for(char s: sentence.toCharArray()){
            sentenceWithoutDuplicates.add(s);
        }

        int count = 0;
        List<Character> alphabets = Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k' ,'l' , 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z');
        for(char e: sentenceWithoutDuplicates){
            if(alphabets.contains(e)){
                count++;
            }
        }

        if(count >= 26){
            return true;
        }

        return false;
    }



}
/* public boolean checkIfPangram(String sentence) {
        boolean[] alphabet = new boolean[26];

        for (int i = 0; i < sentence.length(); i++) {
            // [char-'a'] will get the index of array from 0 to 25
            // Example: 'a' - 'a' == 0, 'b' - 'a' == 1, 'c' - 'a' == 2 and etc.
            if (!alphabet[sentence.charAt(i)-'a']) {
                alphabet[sentence.charAt(i)-'a'] = true;
            }
        }

        for (boolean character : alphabet) {
            if (!character) {
                return false;
            }
        }

        return true;
    }*/