package com.leetcode.RecursionString;

public class SkipString {
    public static void main(String[] args) {
        String originalString = "bacchad";
        String ans = "";
        skip(ans, originalString); // skip "a" from the string and print the ans
        System.out.println(skip2(originalString)); // returning String at every function call
        System.out.println(skipApple("baccapplehad")); // return string without "apple" in it
    }

    private static void skip(String ans, String originalString) {

        if(originalString.isEmpty()){
            System.out.println(ans);
            return;
        }

        char ch = originalString.charAt(0);
        if(ch == 'a'){
            skip(ans, originalString.substring(1));
        } else {
            skip(ans + ch, originalString.substring(1));

        }
    }

    private static String skip2(String originalString){

        if(originalString.isEmpty()){
            return " ";
        }

        char ch = originalString.charAt(0);
        if(ch == 'a'){
            return skip2(originalString.substring(1));
        } else{
            return ch + skip2(originalString.substring(1));
        }
    }

    private static String skipApple(String originalString){

        if(originalString.isEmpty()){
            return "";
        }

        char ch = originalString.charAt(0);
        if(originalString.startsWith("apple")){
            return skipApple(originalString.substring(5));
        } else {
            return ch + skipApple(originalString.substring(1));
        }
    }


}
